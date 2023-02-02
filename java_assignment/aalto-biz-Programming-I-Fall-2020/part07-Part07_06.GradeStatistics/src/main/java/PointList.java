
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
public class PointList {
    private ArrayList <Integer> points;
    private ArrayList <Integer> grades;
    public PointList(){
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    public void add(int num){
        if(num >=0 && num <=100){
            this.points.add(num);
            
            if(num < 50){
                this.grades.add(0);
            }else if(num < 60 && num >= 50){
                this.grades.add(1);
            }else if(num < 70 && num >= 60){
                this.grades.add(2);
            }else if(num < 80 && num >= 70){
                this.grades.add(3);
            }else if(num < 90 && num >= 80){
                this.grades.add(4);
            }else{
                this.grades.add(5);
            }                                                         
        }
        
        
    }
    public double averageAll(){
        int totalNum = this.points.size();
        int sum = 0;
        if(totalNum == 0){
            return -1.0;
        }
        for(int point: this.points){
            sum += point;
        }
        double averageAll = sum * 1.0 / totalNum;
        return averageAll;
    }
    public void printAverageAll(){
        if(averageAll() == -1.0){
            System.out.println("Point average (all): -");
        }else{
            System.out.println("Point average (all): " + averageAll());
        }
    }
    public double averagePassing(){
        int totalNum = 0;
        int sum = 0;               
        for(int point: this.points){
            if(point > 50){
                sum += point;
                totalNum ++;
            }            
        }
        if(totalNum == 0){
           return -1.0;
        }
        double averagePassing = sum * 1.0 / totalNum;
        return averagePassing;              
    }
    public void printAveragePassing(){
        if(averagePassing() == -1.0){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): " + averagePassing());
        }
    }
    public double passPercentage(){
        if(averagePassing() == -1.0){
            return 0.0;
        }
        int passNum = 0;
        for(int point: this.points){
            if(point >= 50){
                passNum++;
            }
        }
        double passPercentage = passNum * 100.0 / this.points.size();
        return passPercentage;
    }
    public void printPassPercentage(){
        if(passPercentage() == 0.0){
            System.out.println("Pass percentage: 0.0");
        }else{
            System.out.println("Pass percentage: " + passPercentage());
        }
    }
    public void printGradeDistribution(){
        for(int i = 5; i>= 0; i--){
            int num = 0;
            for(int grade: this.grades){
                if(grade == i){
                    num ++;
                }
            }
            System.out.println(i + ": " + stars(num));
        }
    }
    public String stars(int num){
        String stars = "";
        for (int i = 0; i < num; i ++){
            stars += "*";
        }
        return stars;
    }
        
    
}
