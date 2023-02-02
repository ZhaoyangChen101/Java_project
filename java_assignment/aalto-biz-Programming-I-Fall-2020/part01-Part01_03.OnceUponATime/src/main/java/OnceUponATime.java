
import java.util.ArrayList;
import java.util.Scanner;


public class OnceUponATime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures?");
        ArrayList <Integer> temps = new ArrayList<>();
        int days = Integer.valueOf(scanner.nextLine());
        readTemp(temps,days);
        System.out.println("");
        report(temps);
        
    }
    public static void readTemp(ArrayList <Integer> temps, int days){
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= days; i ++){
            System.out.print("Day " + i + "'s high temp: ");
            int temp = Integer.valueOf(scanner.nextLine());
            temps.add(temp);
        }
    }
    public static void report(ArrayList<Integer> temps){
        if(temps.size() == 0){
            System.out.println("There is no temperature data!");
        }else{
            int sumOfTemp = 0;
            int days = temps.size();
            for(int temp: temps){
                sumOfTemp += temp;
            }
            double average = sumOfTemp * 1.0 / days;
            System.out.println("Average high temperature is " + average + " degrees.");
            int daysAboveAvg= 0;
            for (int temp: temps){
                if(temp > average){
                    daysAboveAvg++;
                }
            }
            System.out.println(daysAboveAvg + " days were above average.");
            int coldestDay = 1;
            int coldestTemp = temps.get(0);
            int hottestDay = 1;
            int hottestTemp = temps.get(0);
            for (int i = 0; i < temps.size(); i++){
                if(temps.get(i)<coldestTemp){
                    coldestDay = i + 1;
                    coldestTemp = temps.get(i);
                }
                if(temps.get(i)> hottestTemp){
                    hottestDay = i + 1;
                    hottestTemp = temps.get(i);
                }
            }
            System.out.println("The coldest day was day " + coldestDay + ": " + coldestTemp + " degrees.");
            System.out.println("The hottest day was day " + hottestDay + ": " + hottestTemp + " degrees.");
        }
    }
}
