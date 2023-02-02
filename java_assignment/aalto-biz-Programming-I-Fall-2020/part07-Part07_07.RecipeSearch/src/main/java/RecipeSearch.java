
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipes = new RecipeList();
        UserInterface userInterface = new UserInterface(scanner,recipes);
        userInterface.start();
    }

}
