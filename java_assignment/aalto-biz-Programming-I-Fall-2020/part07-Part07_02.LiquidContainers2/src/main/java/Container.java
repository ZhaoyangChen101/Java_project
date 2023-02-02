
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
public class Container {
    private int firstLitre;
    private int secondLitre;
    private Scanner scan;
    public Container(){
        this.firstLitre = 0;
        this.secondLitre = 0;
        this.scan = new Scanner(System.in);
    }
    public void start(){
        while(true){
            print();
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts [0];
            int litre = Integer.valueOf(parts[1]);
            //add
            ifEqualsAdd(command,litre);
            //move
            ifEqualsMove(command,litre);
            //remove
            ifEqualsRemove(command,litre);
            
        }
    }
    public void print(){
        System.out.println("First: " + this.firstLitre + "/100");
        System.out.println("Second: " + this.secondLitre + "/100");
    }
    public void ifEqualsAdd(String command, int litre){
        if(command.equals("add")){
                if(litre > 0){
                   if(litre + this.firstLitre <= 100){
                        this.firstLitre += litre;
                   }else{
                        this.firstLitre = 100;
                   } 
                }               
        }
    }
    public void ifEqualsMove(String command, int litre){
        if(command.equals("move")){
                if(litre > 0){
                    if(litre >= this.firstLitre){
                        
                        if( this.firstLitre + this.secondLitre <= 100){
                            
                            this.secondLitre += this.firstLitre;
                            this.firstLitre = 0;
                        }else{
                            this.secondLitre = 100;
                        }                       
                    }else{
                        this.firstLitre -= litre;
                        if(litre + this.secondLitre <= 100){
                            this.secondLitre += litre;
                        }else{
                            this.secondLitre = 100;
                        }                       
                    }
                }
        }
    }
    public void ifEqualsRemove(String command, int litre){
        if(command.equals("remove")){
                if(litre > 0){
                    if (litre > this.secondLitre){
                        this.secondLitre = 0;
                    }else{
                        this.secondLitre -= litre;
                    }
                }
        }
    }
    
}
/*private int liquidAmount;
    public Container(){
        this.liquidAmount = 0;
    }
    public int contains(){
        return this.liquidAmount;
    }
    public void add(int amount){
        if(amount > 0){
            if(amount + this.liquidAmount >= 100){
                this.liquidAmount = 100;
            }else{
                this.liquidAmount += amount;
            }
        }
    }
    public void remove(int amount){
        if(amount > 0){
            if (this.liquidAmount - amount <= 0){
                this.liquidAmount = 0;
            }else{
                this.liquidAmount -= amount;
            }
        }
    }
    public String toString(){
        return this.liquidAmount + "/100";
    }*/
