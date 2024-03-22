
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write numbers:");
        int sum = 0;
        int total = 0;
        int odd = 0;
        int even = 0;
                
        while (true) {  
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            if (number %2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
            sum = sum + number;
            total = total + 1;        
        }
        double average = 1.0 * sum / total;
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average:" + average);
        System.out.println("Even: " + even );
        System.out.println("Odd: " + odd);       
    }
}
