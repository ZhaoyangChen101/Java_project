
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }
    //下面的函数都写对了的
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.owners.containsKey(licensePlate)){
            return false;
        }
        this.owners.put(licensePlate, owner);
        return true;
    }
    public String get(LicensePlate licensePlate){
        if(this.owners.containsKey(licensePlate)){
            return this.owners.get(licensePlate);
        }
        return null;
    }
    public boolean remove(LicensePlate licensePlate){
        if(this.owners.containsKey(licensePlate)){
            this.owners.remove(licensePlate);
            return true;
        }
        return false;
    }
    public void printLicensePlates(){
        for(LicensePlate licensePlate: this.owners.keySet()){
            System.out.println(licensePlate);
        }
    }
    public void printOwners(){
        ArrayList<String> ownerList = new ArrayList<>();
        for(String owner: this.owners.values()){
            if(!(ownerList.contains(owner))){
                ownerList.add(owner);
            }
        }
        for(String owner: ownerList){
            System.out.println(owner);
        }
    }
}
