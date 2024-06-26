
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int counter = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int number = Integer.valueOf(reader.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    list.add(number);
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
    }
        System.out.println("Numbers: " + counter);
        
    }

}
