/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Whistle {
    private String sound; //私有的成员变量声明
    //构造方法
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
    //method，实际功能
    public void sound(){
        System.out.println(this.sound);
    } 
    
    
}
