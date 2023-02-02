
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
public class ChangeHistory {
    private ArrayList<Double> histories;
    public ChangeHistory(){
        this.histories = new ArrayList<>();
    }
    public void add(double status){
        this.histories.add(status);
    }
    public void clear(){
        this.histories.clear();
    }
    //看下arraylist<double>直接返回给string可行否,不得行;
    //arraylist的toString对于这种string, double,integer普通类型是完全可行的
    @Override
    public String toString(){
        return this.histories.toString();
    }
    public double maxValue(){
        if(this.histories.isEmpty()){
            return 0.0;
        }
        double max = this.histories.get(0);
        for(Double history: this.histories){
            if(history > max){
                max = history;
            }
        }
        return max;       
    }
    public double minValue(){
        if(this.histories.isEmpty()){
            return 0.0;
        }
        double min = this.histories.get(0);
        for(Double history: this.histories){
            if(history < min){
                min = history;
            }
        }
        return min;         
    }
    public double average(){
        if(this.histories.isEmpty()){
            return 0.0;
        }
        int totalNum = this.histories.size();
        double sum = 0.0;
        for (Double history: this.histories){
            sum += history;
        }
        double avg = sum / totalNum;
        return avg;
    }
}
