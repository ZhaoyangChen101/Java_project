
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    public void start(){
        while(true){
            System.out.print("Command:");
            String line = this.scanner.nextLine();
            if(line.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(line.equals("add")){
                System.out.print("Word:");
                String word = this.scanner.nextLine();
                System.out.print("Translation:");
                String translation = this.scanner.nextLine();
                this.simpleDictionary.add(word, translation);
            }else if(line.equals("search")){
                System.out.print("To be translated:");
                String word = this.scanner.nextLine();
                String translation = this.simpleDictionary.translate(word);
                if(translation == null){
                    System.out.println("Word " + word + " was not found");
                }else{
                    System.out.println("Translation: " + translation);
                }                
            }else{
                System.out.println("Unknown command");
            }           
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }
}
