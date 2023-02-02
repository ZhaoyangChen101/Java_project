
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        System.out.print("Enter username:");
        String inputUser = scanner.nextLine();
        System.out.print("Enter password:");
        String inputPasswd = scanner.nextLine();
        for (int i =0; i < username.length; i++){
            if (!(inputUser.equals(username[i])) && i != username.length -1){
                continue;
            }
            if (inputUser.equals(username[i])){
                if (inputPasswd.equals(password[i])){
                    System.out.println("You have successfully logged in!");
                }else{
                    System.out.println("Incorrect username or password!");
                }
                break;
            }
            if (!(inputUser.equals(username[i])) && i == username.length -1){
                System.out.println("Incorrect username or password!");
            }
        }
    }
}
