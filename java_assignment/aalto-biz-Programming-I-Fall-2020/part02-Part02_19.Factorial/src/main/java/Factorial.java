
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        System.out.println("Give a number?");
        int end = Integer.valueOf(scanner.nextLine());
        int product = 1; //积
        for (int i = start; i <= end; i ++){
            product = product * i;
        }
        System.out.println("Factorial: " + product);
    }
}
