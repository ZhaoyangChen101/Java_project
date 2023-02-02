
import java.util.Scanner;
import java.util.ArrayList;
public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
   
                break;
            }   
            String[] pieces = input.split(",");
            ageList.add(Integer.valueOf(pieces[1]));
            nameList.add(pieces[0]);
        }
        int indexOldest = indexAgeOfTheOldest(ageList);
        nameOfTheOldest(nameList, indexOldest);

    }
    public static int indexAgeOfTheOldest(ArrayList<Integer> list){
        int oldest = list.get(0);
        for(int i = 1; i < list.size(); i ++){
            if (list.get(i) > oldest){
                oldest = list.get(i);
            }
        }
        int indexOldest = list.indexOf(oldest);
        return indexOldest;
    }
    public static void nameOfTheOldest (ArrayList<String> list, int indexOldest){
        String nameOldest = list.get(indexOldest);
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
