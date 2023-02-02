
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if (num < 0){
                continue;
            }
            totalNum = totalNum + 1;
            sum = sum + num;
        }
        if (sum == 0){
            System.out.println("Cannot calculate the average");
        }else{
            double average = (sum * 1.0)/totalNum;
            System.out.println("Average of the numbers: " + average);
        }
        
    }
}
