
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0; //和
        int numbers = 0; //计数
        double average = 0; //平均值
        int odd = 0; //奇数的计数
        int even = 0; //偶数的计数
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            }
            if (num % 2 == 0){
                even ++;
            }else{
                odd ++;
            }
            sum = sum + num;
            numbers ++;
            average = (sum * 1.0)/numbers;
        }
        System.out.println("Thx!Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
       
}
