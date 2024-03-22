
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        
        int start = 1;
        int end = Integer.valueOf(scanner.nextLine());
        int total = 0;
                
        for (int i = start; i <= end; i++) {
            total = total + i;
            
        }
        System.out.println("The sum is " + total);

    }
}
