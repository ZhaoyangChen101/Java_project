
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box box = new Box(10);
        
        Box innerBox = new Box(20);
        innerBox.add(new Book("Robert Martin", "Clean Code", 1));
        innerBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(innerBox);
        System.out.println(innerBox);
    }

}
