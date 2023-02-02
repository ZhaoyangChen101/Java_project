/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class CustomeTacoBox implements TacoBox{
    private int tacos;
    public CustomeTacoBox(int tacos){
        this.tacos = tacos;
    }
    public void eat(){
        if(this.tacos >= 1){
            this.tacos --;
        }
    }
    public int tacosRemaining(){
        return this.tacos;
    }
}
