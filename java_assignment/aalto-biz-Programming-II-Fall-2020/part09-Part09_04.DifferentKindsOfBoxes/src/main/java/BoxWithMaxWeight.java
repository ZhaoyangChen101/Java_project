
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    @Override
    public void add(Item item){
        int weight = 0;
        if(!(this.items.isEmpty())){
            for(Item itemOne: this.items){
                weight += itemOne.getWeight();
            }
        }
        if(weight + item.getWeight() <= this.capacity){
            this.items.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
}
