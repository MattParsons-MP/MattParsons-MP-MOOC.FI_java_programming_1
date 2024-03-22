
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            if (number < 0 || number > 0) {
                total = total + 1;
            }
            if (number < 0 || number > 0 ) {
                sum = sum + number;
            }
        }  
        double average = 1.0 * sum/total;
        System.out.println("Average of the numbers: " + average);

    }
}
