import java.util.Scanner;
public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select product (by number):");
        System.out.println("1. Coca-Cola 500ml - €2.50");
        System.out.println("2. ED Energy Drink 500ml - €2.80");
        System.out.println("3. Red Bull 250ml - €3.00");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        System.out.print("Please pay by coins");
        double coinsPayed = Double.valueOf(scanner.nextLine());
        if(input == 1){
            findChanges(2.50,coinsPayed);
        }
        if(input == 2){
            findChanges(2.80,coinsPayed);
        }
        if(input == 3){
            findChanges(3.00,coinsPayed);
        }
    }
    public static void findChanges(double pricePaying, double coinsPayed){
        if(coinsPayed < pricePaying){
            System.out.println("Money is not enough!");
        }else if(coinsPayed == pricePaying){
            System.out.println("You don't have any change.");
        }else{
            double coins = coinsPayed * 100;
            double price = pricePaying * 100;
            double diff = coins - price;            
            int centsRemained = (int) (diff % 100);
            int cents = 0;
            if(centsRemained % 50 == 0){
                cents = centsRemained / 50;
                System.out.println("Your change is:");
                System.out.println(cents + " x 50c");
                }
            if (centsRemained % 20 == 0){
                cents = centsRemained / 20; 
                System.out.println("Your change is:");                    
                System.out.println(cents + " x 20c");
            }           
        }
    }
}
   