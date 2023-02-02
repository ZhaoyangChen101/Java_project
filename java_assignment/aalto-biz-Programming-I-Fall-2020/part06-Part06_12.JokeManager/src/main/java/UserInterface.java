
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
    private JokeManager manager;
    private Scanner scanner;
    public UserInterface(JokeManager manager,Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    public void start(){
        readJokes();
    }
    public void printCommands(){
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list a joke");
        System.out.println("X - stop");
    }
    public void readJokes(){
        while(true){
            printCommands();
            String command = this.scanner.nextLine();
            if(command.equals("X")){
                break;
            }
            if(command.equals("1")){
                System.out.println("Write the joke to be added:");
                String jokeLine = this.scanner.nextLine();
                this.manager.addJoke(jokeLine);
            }
            if(command.equals("2")){
                System.out.println("Drawing a joke");
                System.out.println(this.manager.drawJoke());
            }
            if(command.equals("3")){
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
            
        }
    }
}
