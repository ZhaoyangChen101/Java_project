
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class ToDoList {
    private ArrayList<String> list;
    public ToDoList(){
        this.list = new ArrayList<>();
    }
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        for(String task: this.list){
            System.out.println((this.list.indexOf(task)+1) + " : " + task);
        }
    }
    public void remove(int index){
        this.list.remove(index-1);
    }
}
