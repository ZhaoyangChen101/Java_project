
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        if(this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        }
        return new ArrayList<>();
    }
    public void remove(String storageUnit,String item){
        if(this.storage.containsKey(storageUnit)){
            ArrayList<String> items = this.contents(storageUnit);
            for(String itemOne: items){
                if(itemOne.equals(item)){
                    items.remove(itemOne);
                    if(items.isEmpty()){
                        this.storage.remove(storageUnit);
                    }
                    return;
                }
            }
            
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String key: this.storage.keySet()){
            if(!(this.storage.get(key).isEmpty())){
                units.add(key);
            }
        }
        return units;
    }
}
