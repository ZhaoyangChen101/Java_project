
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
public class Stack {
    private ArrayList<String> list;
    public Stack(){
        this.list = new ArrayList();
    }
    public boolean isEmpty(){
        if(this.list.size() > 0){
            return false;
        }
        return true;
    }
    //最新添加的值放在首位
    public void add(String value){
        this.list.add(0,value);//又学会了如何在特定位置插入值              
    }
    
    //返回list,其他类型的值都有返回的方法，list返回方法先试一下
    public ArrayList<String> values(){
        return this.list;
    }
    //移除第一个值，即最新添加的值
    public String take(){
        String start = this.list.get(0);
        this.list.remove(0);
        return start;
    }    
}
