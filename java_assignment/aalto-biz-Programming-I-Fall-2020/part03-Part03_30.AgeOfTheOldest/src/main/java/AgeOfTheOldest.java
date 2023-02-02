
import java.util.Scanner;
import java.util.ArrayList;
public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ageList = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
   
                break;
            }   
            String[] pieces = input.split(",");
            ageList.add(Integer.valueOf(pieces[1]));
        }
        ageOfTheOldest(ageList);//function
    }
    public static void ageOfTheOldest(ArrayList<Integer> list){
        int oldest = list.get(0);
        for(int i = 1; i < list.size(); i ++){
            if (list.get(i) > oldest){
                oldest = list.get(i);
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
