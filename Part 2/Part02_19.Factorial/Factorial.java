
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int last = Integer.valueOf(scanner.nextLine());
        int first = 1; 
        int factorial = 1;
        for (int i = first; i <= last; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);

    }
}