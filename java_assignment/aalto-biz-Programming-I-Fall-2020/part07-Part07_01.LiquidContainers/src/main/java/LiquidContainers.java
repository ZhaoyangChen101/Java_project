
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstLitre = 0;
        int secondLitre = 0;

        while (true) {
            System.out.println("First: " + firstLitre + "/100");
            System.out.println("Second: " + secondLitre + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts [0];
            int litre = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                if(litre > 0){
                   if(litre + firstLitre <= 100){
                        firstLitre += litre;
                   }else{
                        firstLitre = 100;
                   } 
                }               
            }
            if(command.equals("move")){
                if(litre > 0){
                    if(litre >= firstLitre){
                        
                        if( firstLitre + secondLitre <= 100){
                            
                            secondLitre += firstLitre;
                            firstLitre = 0;
                        }else{
                            secondLitre = 100;
                        }                       
                    }else{
                        firstLitre -= litre;
                        if(litre + secondLitre <= 100){
                            secondLitre += litre;
                        }else{
                            secondLitre = 100;
                        }                       
                    }
                }
            }
            if(command.equals("remove")){
                if(litre > 0){
                    if (litre > secondLitre){
                        secondLitre = 0;
                    }else{
                        secondLitre -= litre;
                    }
                }
            }
            

        }
    }

}
