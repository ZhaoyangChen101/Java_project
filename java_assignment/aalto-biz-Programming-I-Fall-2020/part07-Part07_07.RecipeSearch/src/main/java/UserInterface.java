
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class UserInterface {
    private Scanner scanner;
    private RecipeList recipes;
    public UserInterface(Scanner scanner,RecipeList recipes){
        this.scanner = scanner;
        this.recipes = recipes;
    }
    public void start(){
        System.out.print("File to read: ");
        String file = this.scanner.nextLine();
        readFile(file);
        System.out.println("");
        printCommands();
        while(true){
            System.out.print("Enter command:");
            String command = this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                this.recipes.listRecipes();
            }
            //findname
            if(command.equals("find name")){
                System.out.print("Searched word:");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                this.recipes.recipeWithSearchedWord(word);
            }
            if(command.equals("find cooking time")){
                System.out.print("Max cooking time:");
                int maxTime = Integer.valueOf(scanner.nextLine());
                this.recipes.recipeWithinTime(maxTime);
            }
            if(command.equals("find ingredient")){
                System.out.print("Ingredient:");
                String word = scanner.nextLine();
                this.recipes.recipeWithIngredient(word);
            }
        }
    }
    public void printCommands(){
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
    }
    public void readFile(String file){
        ArrayList<String> parts = new ArrayList<>();//巧妙解决了位置问题
        try(Scanner scan = new Scanner(Paths.get(file))){                        
            while(scan.hasNextLine()){
                
                String line;
                line = scan.nextLine();
                if(!line.isEmpty()){
                    parts.add(line);
                }else{
                    //原始变量的赋值就是真实的赋值
                    String name = parts.get(0);
                    int cookingTime = Integer.valueOf(parts.get(1));
                    parts.remove(0);
                    parts.remove(0);
                    //对象赋值的时候，只是地址赋值
                    //此处对list来说，如果直接将parts赋值给ingredients，就只是地址
                    //不论parts在之前或之后做任何修改，都会影响到ingredients的值
                    //故，需要把里面的元素进行一一复制存储起来。于是有了clone函数。
                    ArrayList<String> ingredients = clone(parts);
                    
                    this.recipes.addRecipes(name, cookingTime, ingredients);
                    parts.clear();//搞得好
                }            
            }
            if(!parts.isEmpty()){
                String name = parts.get(0);
                int cookingTime = Integer.valueOf(parts.get(1));
                parts.remove(0);
                parts.remove(0);
                ArrayList<String> ingredients = clone(parts);
                //ArrayList<String> ingredients = parts;
                
                this.recipes.addRecipes(name, cookingTime, ingredients);
                parts.clear();
            }            
        }catch(Exception e){
            System.out.println("File was not read correctly.");
        }
    }
    public ArrayList<String> clone(ArrayList<String> elements){
        ArrayList<String> clone = new ArrayList<>();
        for(String element: elements){
            clone.add(element);
        }
        return clone;
    }
}
