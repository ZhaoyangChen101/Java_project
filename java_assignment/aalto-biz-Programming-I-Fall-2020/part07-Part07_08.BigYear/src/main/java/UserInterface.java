
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
    private BirdList birds;
    public UserInterface(Scanner scanner,BirdList birds){
        this.scanner = scanner;
        this.birds = birds;
    }
    public void start(){
        while(true){
            System.out.print("?");
            String command = this.scanner.nextLine();
            execution(command);
            if(command.equals("Quit")){
                break;
            }
        }
        
        
    }
    public void execution(String command){
        if(command.equals("Add")){
            System.out.print("Name:");
            String name = this.scanner.nextLine();
            System.out.print("Name in Latin:");
            String latinName = this.scanner.nextLine();
            this.birds.addBird(name, latinName);
        }
        if(command.equals("Observation")){
            System.out.print("Bird?");
            String name = this.scanner.nextLine();
            if(!this.birds.isBird(name)){
                System.out.println("Not a bird!");
            }else{
                this.birds.birdsObserved(name);
            }
        }
        if(command.equals("All")){
            this.birds.printAllBirds();
        }
        if(command.equals("One")){
            System.out.print("Bird?");
            String name = this.scanner.nextLine();
            this.birds.printOneBird(name);
        }
        
            
    }
    
}
