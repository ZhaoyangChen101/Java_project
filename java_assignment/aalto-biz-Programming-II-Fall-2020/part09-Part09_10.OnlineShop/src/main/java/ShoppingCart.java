
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class ShoppingCart {
    private Map<String,Item> items;
    public ShoppingCart(){
        this.items = new HashMap<>();
    }
    public void add(String product, int price){
        this.items.putIfAbsent(product, new Item(product,0,price));
        for(Item item: this.items.values()){
            if(item.getProduct().equals(product)){
                item.increaseQuantity();
            }
        }
    }
    public int price(){
        int sum = 0;
        for(Item item: this.items.values()){
            sum += item.price();
        }
        return sum;
    }
    public void print(){
        for(Item item: this.items.values()){
            System.out.println(item.getProduct() + ": " + item.getQty());
        }
    }
}
