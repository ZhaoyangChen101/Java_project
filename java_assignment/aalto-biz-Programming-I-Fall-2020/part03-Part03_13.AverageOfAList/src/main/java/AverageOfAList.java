
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        // implement here a program, that first reads user input
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            list.add(input);
        }
        // adding them on a list until user gives -1.
        int sum = 0;
        int totalNumbers = list.size();
        // Then it computes the average of the numbers on the list
        for(int num: list){
            sum = sum + num;
        }
        double avg = sum * 1.0 / totalNumbers;
        System.out.println("Average: " + avg);
        // and prints it.
        
    }
}
