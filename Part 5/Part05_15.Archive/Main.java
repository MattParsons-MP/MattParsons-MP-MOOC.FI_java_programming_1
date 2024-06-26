
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> data = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String ident = scanner.nextLine();
            if (ident.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive info = new Archive(name, ident);
            if (!data.contains(info)){
                data.add(info);
            }
            
        }
        for (Archive n : data) 
            System.out.println(n);
        
    }
}
