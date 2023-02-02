
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class UserInterface {
    private PointList points;
    private Scanner scanner;
    public UserInterface(PointList points, Scanner scanner){
        this.points = points;
        this.scanner = scanner;
    }
    public void start(){
        System.out.println("Enter point totals, -1 stops");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            this.points.add(num);
        }                        
        this.points.printAverageAll();
        this.points.printAveragePassing();
        this.points.printPassPercentage();
        this.points.printGradeDistribution();
    }
}
