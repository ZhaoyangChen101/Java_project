
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
    }
    public void addSuitcase(Suitcase suitcase){
        if(this.suitcases.isEmpty()){
            if(suitcase.totalWeight() <= maxWeight){
                this.suitcases.add(suitcase);
                this.totalWeight += suitcase.totalWeight();
            }
        }else{
            int previousWeight = 0;
            for(Suitcase suitcaseOne: suitcases){
                previousWeight += suitcaseOne.totalWeight();
            }
            if((suitcase.totalWeight()+ previousWeight) <= maxWeight){
                this.totalWeight += suitcase.totalWeight();
                this.suitcases.add(suitcase);
            }
        }
    }
    public String toString(){
        if(this.suitcases.isEmpty()){
            return "no suitcases (0 kg)";
        }
        if(this.suitcases.size() == 1){
            return "1 suitcase " + "(" + this.totalWeight + " kg)";
        }
        //先写好适合大部分情况的，在考虑其他小几率情况
        return this.suitcases.size() + " suitcases" + " (" 
                + this.totalWeight + " kg)";
    }
    public void printItems(){
        for (Suitcase suitcaseOne: suitcases){
            suitcaseOne.printItems();
        }
    }
}
