/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class ProductWarehouse extends Warehouse{
    private String productName;
    public ProductWarehouse(String ProductName, double capacity){
        super(capacity);
        this.productName = ProductName;
    }
    public String getName(){
        return this.productName;
    }
    public void setName(String newName){
        this.productName = newName;
    }
    public String toString(){
        return this.productName + ": " + super.toString();
    }
}
