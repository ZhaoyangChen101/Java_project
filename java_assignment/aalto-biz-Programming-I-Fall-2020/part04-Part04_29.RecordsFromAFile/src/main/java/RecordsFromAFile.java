import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//读取用户输入
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        //ArrayList<Records> records = new ArrayList<>();
        //创建scanner对象读取文件数据，try catch
        try(Scanner readFile = new Scanner(Paths.get(file))){
            while(readFile.hasNextLine()){
                String line = readFile.nextLine();
                if (line.isEmpty()){
                    continue;
                }
                String [] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                //records.add(new Records(name, age));
                if(age > 1 || age == 0){
                    System.out.println(name + ", age: " + age + " years");
                }else{
                    System.out.println(name + ", age: " + age + " year");
                }
            }
            /*for(Records record: records){
                System.out.println(record);
            }*/
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
