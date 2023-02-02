
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface= new UserInterface(scanner, first,second);
        userInterface.start();
        
        
    }

}
