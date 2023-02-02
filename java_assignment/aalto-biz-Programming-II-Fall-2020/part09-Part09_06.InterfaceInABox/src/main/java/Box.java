
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
public class Box implements Packable{
    private double capacity;
    //private double weight;
    private ArrayList<Packable> packables;
    public Box(double capacity){
        this.capacity = capacity;
        //this.weight = 0.0;
        this.packables = new ArrayList<>();
    }
    public void add(Packable packable){
        if(packable.weight() + this.weight() <= this.capacity){
            this.packables.add(packable);
        }       
    }
    //计算box总weight
    @Override
    public double weight(){
        double weight = 0.0;
        for(Packable packable: this.packables){
            weight += packable.weight();
        }
        return weight;
    }
    @Override
    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight " + this.weight() + " kg";
    }
}
