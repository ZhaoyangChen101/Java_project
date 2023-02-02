
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("---");
        printRectangle(5, 6);
        System.out.println("---");
        printTriangle(3);
        System.out.println("---"); 
    }

    public static void printStars(int number) {
        // first part of the exercise
        int i = 0;
        while (i < number){
            System.out.print("*");
            i ++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int i = 0;
        while (i < size){
            printStars(size);
            
            i ++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int i = 0; i < height; i ++){
            printStars(width);
            
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i <= size; i ++){
            printStars(i);
          
        }
    }
}
