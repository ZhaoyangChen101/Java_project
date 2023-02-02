
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> yearList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
   
                break;
            }   
            String[] pieces = input.split(",");
            yearList.add(Integer.valueOf(pieces[1]));
            nameList.add(pieces[0]);
        }
        //function
        nameOfTheLongest(nameList);
        averageOfYears(yearList);

    }
    public static void averageOfYears(ArrayList<Integer> list){
        int sum = 0;
        int total = list.size();
        for(int i = 0; i < list.size(); i ++){
            sum = sum + list.get(i); 
        }
        double avg = sum * 1.0 / total;
        System.out.println("Average of the birth years: " + avg);
    }
    public static void nameOfTheLongest (ArrayList<String> list){
        ArrayList <Integer> lengthList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            int length = list.get(i).length();
            lengthList.add(length);
        }
        int maxLength = lengthList.get(0);
        for (int i = 1; i < lengthList.size(); i ++){
            if (lengthList.get(i) <= maxLength){
                continue;
            }
            if(lengthList.get(i) > maxLength){
                maxLength = lengthList.get(i);
            }
        }
        int indexOfMaxLength = lengthList.indexOf(maxLength);
        String nameOfMaxLength = list.get(indexOfMaxLength);
        System.out.println("Longest name: " + nameOfMaxLength);
    }
}
