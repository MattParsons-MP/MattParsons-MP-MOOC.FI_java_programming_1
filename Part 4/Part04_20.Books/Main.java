import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
        ArrayList<Books> library = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
     
            library.add(new Books(title, pages, year));
        }
        //System.out.println(library);
        System.out.println("What information will be printed? ");
        String request = scanner.nextLine();
        
        for (Books book: library) {
            if (request.equals("everything")) {
                System.out.println(library);        
            } else if (request.equals("name")) {
                System.out.println(book.getName());
            }
        }
        
    }
            
        
        
                
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
}
