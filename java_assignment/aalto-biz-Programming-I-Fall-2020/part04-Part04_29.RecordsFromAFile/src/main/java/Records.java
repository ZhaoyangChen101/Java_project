/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Records {
    private String name;
    private int age;
    public Records(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        if(this.age > 1){
            return this.name + ", age: " + this.age + " years"; 
        }else{
            return this.name + ", age: " + this.age + " year";
        }
    }
}
