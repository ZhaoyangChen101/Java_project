
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());
        if (year % 100 == 0){  //最严格的条件放在最前面
            if (year % 400 == 0){
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        } else {
            if (year % 4 == 0){
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        }
    }
}
