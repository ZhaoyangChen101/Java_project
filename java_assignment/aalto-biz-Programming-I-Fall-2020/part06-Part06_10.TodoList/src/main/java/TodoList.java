
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
public class TodoList {
    private ArrayList<String> todos;
    public TodoList(){
        this.todos = new ArrayList<>();
    }
    public void add(String task){
        todos.add(task);
    }
    public void print(){
        for(String todo: todos){
            int index = todos.indexOf(todo) + 1;
            System.out.println(index + ": " + todo);
        }
    }
    public void remove(int number){
        int index = number - 1;
        todos.remove(index);
    }
}
