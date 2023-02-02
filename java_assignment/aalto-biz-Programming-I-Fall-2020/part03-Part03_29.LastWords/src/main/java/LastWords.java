
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            printLastWord(input);
        }
    }
    public static void printLastWord(String input){
        String[] pieces = input.split(" ");
        int lastPosition = pieces.length -1;
        String lastWord = pieces[lastPosition];
        System.out.println(lastWord);
    }

    
}
