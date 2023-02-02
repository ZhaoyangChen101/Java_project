
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AdaLovelace {

    public static void main(String[] args) {
       // Write your program here
       Scanner scanner = new Scanner(System.in);
       ArrayList<String> colors = new ArrayList<>();
       colors.add("red");
       colors.add("orange");
       colors.add("yellow");
       colors.add("green");
       colors.add("blue");
       colors.add("indigo");
       colors.add("violet");
       Random random = new Random();
       int n = random.nextInt(colors.size());
       String randomColor = colors.get(n);
       System.out.println("This time the colour of the rainbow is " + randomColor + ".");
       if(randomColor.equals("red") || randomColor.equals("blue") || randomColor.equals("green")){
           System.out.println("It’s one of the three primary colours!");
       }else{
           System.out.println("It’s not among the three primary colours.");
       }
    }
}
