
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            totalNum = totalNum + 1;
            sum = sum + num;
        }
        double average = (sum * 1.0)/totalNum;
        System.out.println("Average of the numbers: " + average);
    }
}
