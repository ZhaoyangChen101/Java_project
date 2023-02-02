
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int point = Integer.valueOf(scanner.nextLine());
        if (point < 0){
            System.out.println("impossible!");
        }else if (point <=49 && point >= 0){
            System.out.println("failed");
        }else if(point >=50 && point <= 59){
            System.out.println("1");
        }else if(point >= 60 && point <= 69){
            System.out.println("2");
        }else if(point >= 70 && point <= 79){
            System.out.println("3");
        }else if(point >= 80 && point <= 89){
            System.out.println("4");
        }else if(point >= 90 && point <=100){
            System.out.println("5");
        }else{
            System.out.println("incredible!");
        }
    }
}
