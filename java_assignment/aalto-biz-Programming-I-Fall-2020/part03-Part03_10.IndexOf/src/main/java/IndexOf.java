
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        //System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for?");
        int number = Integer.valueOf(scanner.nextLine());
        //int indexOfNumber = list.indexOf(number); 实现不了功能
        //System.out.println(indexOfNumber);
        for (int i =0; i < list.size();i++ ){
            int listNum = list.get(i);
            if (listNum == number){
                System.out.println(number + " is at index " + i);
            }
        }
    }
}
