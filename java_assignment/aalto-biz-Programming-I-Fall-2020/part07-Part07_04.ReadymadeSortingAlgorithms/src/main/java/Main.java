
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        //int[] array1 = {3, 1, 5, 99, 3, 12};
        //sort(array1);
        //System.out.println(Arrays.toString(array1));
        //String[] array2 ={"apple", "ant", "banana", "orange"};
        //sort(array2);
        //System.out.println(Arrays.toString(array2));
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("appale");
        numbers.add("alall");
        numbers.add("osaos");
        System.out.println(numbers);
        sortStrings(numbers);
        System.out.println(numbers);
    }
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String [] array){
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
    
}
