
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstLitre = 0;
        int secondLitre = 0;
        while (true) {
            System.out.println("First: " + firstLitre +"/100");
            System.out.println("Second:" + secondLitre + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts[0];
            int num = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                if(num> 0){
                    if(num + firstLitre > 100){
                        firstLitre = 100;
                    }else{
                        firstLitre += num;
                    }
                }
            }
            if(command.equals("move")){
                if(num > 0){
                    if(num > firstLitre){
                        secondLitre += firstLitre;
                        firstLitre = 0;
                    }else{
                        
                        if(num + secondLitre > 100){
                            secondLitre = 100;
                            firstLitre -= num;
                        }else{
                            secondLitre += num;
                            firstLitre -= num;
                        }
                    }
                }
            }
            if(command.equals("remove")){
                if(num > 0){
                    if(num > secondLitre){
                        secondLitre = 0;
                    }else{
                        secondLitre -= num;
                    }
                }
            }

        }
    }

}
