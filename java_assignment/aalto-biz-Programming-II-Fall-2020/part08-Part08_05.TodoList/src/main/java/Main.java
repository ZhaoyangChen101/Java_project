
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        UserInterFace ui = new UserInterFace(list, scanner);
        ui.start();
       

    }
}
