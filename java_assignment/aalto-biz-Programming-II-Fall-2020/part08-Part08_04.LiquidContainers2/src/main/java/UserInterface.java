
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
    private Container first;
    private Container second;
    public UserInterface(Scanner scanner,Container first, Container second){
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }
    public void start(){
        while(true){
            System.out.println("First: " + this.first);
            System.out.println("Second: " + this.second);
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts[0];
            int num = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                this.first.add(num);
            }
            if(command.equals("remove")){
                this.second.remove(num);
            }
            if(command.equals("move")){
                if(num > 0){
                    if(num > this.first.contains()){
                        this.second.add(this.first.contains());
                        this.first.setContainer(0);
                    }else{
                        
                        if(num + this.second.contains() > 100){
                            this.second.setContainer(100);
                            this.first.setContainer(this.first.contains()-num);
                        }else{
                            
                            this.second.add(num);
                            this.first.setContainer(this.first.contains()-num);
                        }
                    }
                }
            }
        }
    }
}
