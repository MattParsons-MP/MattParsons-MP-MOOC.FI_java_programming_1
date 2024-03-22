
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0 || number < 0) {
                total = total + 1;
            }
            
            if (number > 0 || number < 0) {
                sum = sum + number;
            } 
        }
        System.out.println("Number of numbers:" + total);
        System.out.println("Sum of the numbers:" + sum);                     
    }
}
