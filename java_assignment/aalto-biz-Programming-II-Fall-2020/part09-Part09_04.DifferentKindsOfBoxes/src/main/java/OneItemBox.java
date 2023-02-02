
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
public class OneItemBox extends Box{
    private ArrayList<Item> oneItemBox;
    public OneItemBox(){
        this.oneItemBox = new ArrayList<>();
    }
    @Override
    public void add(Item item){
        if(this.oneItemBox.isEmpty()){
            this.oneItemBox.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item){
        return this.oneItemBox.contains(item);
    }
    
}
