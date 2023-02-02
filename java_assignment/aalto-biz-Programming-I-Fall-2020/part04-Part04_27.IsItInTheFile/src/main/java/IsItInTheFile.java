import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        //读取并存储在list中，因为list有list.contains()功能，查找元素是否存在
        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                list.add(read.nextLine());
            }
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            if (list.contains(searchedFor)){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        
    }
}
