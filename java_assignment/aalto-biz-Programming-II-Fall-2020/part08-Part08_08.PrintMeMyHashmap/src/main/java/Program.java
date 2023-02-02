
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        
    }
    //把hashmap中的key全部打印出来
    public static void printKeys(HashMap<String,String> hashmap){
        for(String key: hashmap.keySet()){
            System.out.println(key);
        }
    }
    //hashmap包含某个字段的key
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String key:hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }
    //将包含某字段的key的value输出
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for(String key: hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }

}
