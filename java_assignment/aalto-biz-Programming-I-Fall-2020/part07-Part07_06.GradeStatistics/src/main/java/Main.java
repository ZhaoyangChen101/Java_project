
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointList points = new PointList();
        UserInterface userInterface = new UserInterface(points, scanner);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        userInterface.start();
        
    }
}
