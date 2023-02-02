
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class RecipeList {
    private ArrayList<Recipe> recipes;
    public RecipeList(){
        this.recipes = new ArrayList<>();
    }
    //增加recipe对象
    public void addRecipes(String name, int cookingTime,ArrayList<String> ingredients){
        this.recipes.add(new Recipe(name, cookingTime, ingredients));
    }
    public void listRecipes(){
        for(Recipe recipe : this.recipes){
            System.out.println(recipe);
        }
    }
    public void recipeWithSearchedWord(String word){
        for(Recipe recipe: this.recipes){
            if(recipe.getName().contains(word)){
                System.out.println(recipe);
            }
        }
    }
    public void recipeWithinTime(int maxTime){
        for (Recipe recipe: this.recipes){
            if(recipe.getCookingTime() <= maxTime){
                System.out.println(recipe);
            }
        }
    }
    public void recipeWithIngredient(String ingredient){
       for(Recipe recipe: this.recipes){
           //string包含什么字符串或者list类型包含什么元素，都可以用contains
           if(recipe.getIngredients().contains(ingredient)){
               System.out.println(recipe);
           }
       } 
    }
    
}
