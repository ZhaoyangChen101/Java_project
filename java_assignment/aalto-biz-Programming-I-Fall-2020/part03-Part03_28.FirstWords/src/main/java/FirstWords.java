
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            printFirstWord(input);
        }
    }
    public static void printFirstWord(String input){
        String[] pieces = input.split(" ");
        String firstWord = pieces[0];
        System.out.println(firstWord);
    }
}
