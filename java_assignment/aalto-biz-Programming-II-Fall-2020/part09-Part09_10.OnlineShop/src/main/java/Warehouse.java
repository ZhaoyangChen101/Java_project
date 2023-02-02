
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;
    //private Set<String> names;
    public Warehouse(){
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
        //this.names = new HashSet<>(); //存储唯一值，即所有值做多出现一次。
    }
    public void addProduct(String product, int price, int stock){
        this.price.put(product, price);
        this.stock.put(product, stock);
        //this.names.add(product);
    }
    public int price(String product){
        if(this.price.containsKey(product)){
            return this.price.get(product);
        }
        return -99;
    }
    public int stock(String product){
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }
        return 0;
    }
    public boolean take(String product){
        if(this.stock.containsKey(product)){
            int presentStock = this.stock.get(product);
            if(presentStock > 0){
                this.stock.put(product, presentStock - 1);
                return true;
            }
        }
        return false;
    }
    public Set<String> products(){
        Set<String> products = new HashSet<>();
        for(String product: this.price.keySet()){
            products.add(product);
        }
        return products;
    }
    @Override
    public String toString(){
        String productsRemained = "";
        for(String productOne: this.stock.keySet()){
            productsRemained = productsRemained + productOne + ": " + this.stock.get(productOne) + "\n";
        }
        return productsRemained;
    }
}
