
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
                
        ArrayList<String> list = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
            String row = reader.nextLine();
            list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");        
        
    }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        while (true) {
            
            if (list.isEmpty()) {
                break;
            }
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
                    break;
            } else { 
                System.out.println("Not found.");
                    break;
            }
        }
                
    }
} 
 