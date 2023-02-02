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
    private int litre;
    public Container(){
        this.litre = 0;
    }
    public void add(int amount){
        if(amount >0){
           if(amount + this.litre > 100){
                this.litre = 100;
            }else{
                this.litre += amount;
            }  
        }
              
    }
    public void remove(int amount){
        if (amount>0){
            if(this.litre<amount){
                this.litre = 0;
            }else{
                this.litre -= amount;
            }
        }
        
    }
    public String toString(){
        return this.litre + "/100";
    }
    public int contains(){
        return this.litre;
    }
    public int setContainer(int num){
        this.litre = num;
        return this.litre;
    }
}
