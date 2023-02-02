
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
public class UserInterFace {
    private Scanner scanner;
    private ToDoList list;
    public UserInterFace(ToDoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if(command.equals("stop")){
                 break;
            }
            if(command.equals("add")){
                System.out.print("To add:");
                String input = this.scanner.nextLine();
                this.list.add(input);
            }
            if(command.equals("list")){
                this.list.print();
            }
            if(command.equals("remove")){
                System.out.print("Which one is removed?");
                int index = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(index);
            }
        }
    }    
}
