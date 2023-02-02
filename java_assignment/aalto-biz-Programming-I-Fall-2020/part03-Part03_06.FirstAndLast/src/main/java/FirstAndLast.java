
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                int lastPosition = list.size() -1;
                String lastString = list.get(lastPosition);
                String firstString = list.get(0);
                System.out.println(firstString);
                System.out.println(lastString);
                break;
            }

            list.add(input);
        }

    }
}
