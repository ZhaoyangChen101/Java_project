import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("File? ");
        String file = scanner.nextLine();
        int count = 0;
        //读取文件，并注入list
        try(Scanner read = new Scanner (Paths.get(file))){
            while(read.hasNextLine()){
                list.add(Integer.valueOf(read.nextLine()));
            }
            System.out.print("Lower bound? ");
            int lowerBound = Integer.valueOf(scanner.nextLine());
            System.out.print("Upper bound? ");
            int upperBound = Integer.valueOf(scanner.nextLine());
            //遍历list并返回在范围内的数值有多少个
            for(int listNum : list){
                if (listNum >= lowerBound && listNum <= upperBound){
                    count ++;
                }
            }
            System.out.println("Numbers: " + count);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        

    }

}
