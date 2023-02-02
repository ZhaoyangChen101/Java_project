
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
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    public Recipe(String name, int cookingTime,ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    public String getName(){
        return this.name;
    }
    public int getCookingTime(){
        return this.cookingTime;
    }
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    public String printIngredients(){
        String ingred = "";
        for(String ingredient: this.ingredients){
            ingred = ingred + ingredient + " ";
        }
        return ingred;       
    }
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime; 
    }
    
}
