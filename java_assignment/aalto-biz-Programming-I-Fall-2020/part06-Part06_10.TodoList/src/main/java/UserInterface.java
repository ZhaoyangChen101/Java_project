
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
    private TodoList todoList;
    public UserInterface(TodoList todoList, Scanner scanner){
        //todolist和scanner对象都是main中创建的
        //只需要把对象赋值进来就好了
        this.scanner = scanner; 
        this.todoList = todoList; 
   }
   public void start(){
       while(true){
           System.out.print("Command: ");
           String line = scanner.nextLine();
           if(line.equals("stop")){
               break;
           }
           if(line.equals("add")){
               System.out.print("To add:");
               todoList.add(scanner.nextLine());
           }
           if(line.equals("list")){
               todoList.print();
           }
           if(line.equals("remove")){
               System.out.print("Which one is removed?");
               int index = Integer.valueOf(scanner.nextLine());
               todoList.remove(index);
           }
       }
   }
}
