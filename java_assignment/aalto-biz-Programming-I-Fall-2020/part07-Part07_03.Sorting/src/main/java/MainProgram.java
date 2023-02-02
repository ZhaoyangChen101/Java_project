
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //int[] array = {3, 1, 5, 99, 3, 12};
        //System.out.println("Smallest: " + MainProgram.smallest(array));
        //System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        /*int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        */
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        //sort.(numbers)也是okay的
    }
    /*static修饰函数的特点。：
    不依赖类对象的存在而存在，没有this指针，只能调用
    本类静态函数和静态变量
    */
    public static int smallest(int [] array){
        int smallest = array[0];
        for(int i = 1; i < array.length; i ++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int [] array){
        int smallestNum = smallest(array);
        int indexOfSmallest = 0;
        for(int i = 0; i < array.length;i ++){
            if(array[i] == smallestNum){
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    public static int indexOfSmallestFrom(int[]array, int index){
        int smallest = array[index];
        for(int i = index + 1; i < array.length; i ++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        int indexOfSmallest = 0;
        for(int i = index; i < array.length;i ++){
            if(array[i] == smallest){
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    public static void swap(int[]array, int index1, int index2){
        int num1 = array[index1];
        int num2 = array[index2];
        array[index1] = num2;
        array[index2] = num1;
    }
    public static void sort(int[]array){
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i ++){
           int smallest = indexOfSmallestFrom(array,i);
           swap(array, smallest, i);
           System.out.println(Arrays.toString(array));
        }
    }
}
