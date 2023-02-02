
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            String input = scanner.nextLine();
            int num = Integer.valueOf(input);           
            if(num > 0){
                sum += num;
                count ++;
            }
            if(num == 0){
                break;
            }
        }
        if(count !=0){
            double avg = sum * 1.0/count;
            System.out.println(avg);
        }else{
            System.out.println("Cannot calculate the average");
        }
        
    }
}
