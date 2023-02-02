import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            books.add(new Books(title, pages, publicationYear));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.equals("everything")){
            for(Books book: books){
                System.out.println(book);
            }
        }
        if (input.equals("name")){
            for(Books book: books){
                System.out.println(book.getTitle());
            }
        }
    }
}
