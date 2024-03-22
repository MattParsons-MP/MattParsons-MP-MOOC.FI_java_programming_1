
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String first = scan.nextLine();
                        
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
                
        System.out.println("Give a double:");
        double value = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean val = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + first);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + value);
        System.out.println("You gave the boolean " + val);

        // Write your program here

    }
}
