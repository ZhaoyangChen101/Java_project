
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            
            numbers.add(number);
        }
        System.out.print("From where?");
        int startPosition = Integer.valueOf(scanner.nextLine());  //Integer.valueOf()
        int start = numbers.get(startPosition);
        System.out.print("To where?");
        int endPosition = Integer.valueOf(scanner.nextLine());
        int end = numbers.get(endPosition);
        System.out.println(start);
        System.out.println(end);
        

    }
}
