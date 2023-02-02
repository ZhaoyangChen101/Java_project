
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
public class BirdList {
    private ArrayList<Bird> birds;
    public BirdList(){
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName){
        birds.add(new Bird(name, latinName));
    }
    
    public boolean isBird(String input){
        for(Bird bird: this.birds){
            if(input.equals(bird.getName())){
                return true;
            }
        }
        return false;
    }
    
    public void birdsObserved(String input){
        for(Bird bird: this.birds){
            if(input.equals(bird.getName())){
                bird.observed();
            }
        }
    }
   
    public void printAllBirds(){
        for(Bird bird: this.birds){
            System.out.println(bird);
        }
    }
    
    public void printOneBird(String input){
        for(Bird bird: birds){
            if(input.equals(bird.getName())){
                System.out.println(bird);
            }
        }
    }
}
