
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
public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    //添加meal
    public void addMeal(String meal){
        if(!(this.meals.contains(meal))){
            this.meals.add(meal);
        }
    }
    //print meals list的meal
    public void printMeals(){
        for (String meal: this.meals){
            System.out.println(meal);
        }
    }
    public void clearMenu(){
        /*for (String meal: this.meals){
            this.meals.remove(meal);           
        }*/
        this.meals.clear();
        
    }
       
}

