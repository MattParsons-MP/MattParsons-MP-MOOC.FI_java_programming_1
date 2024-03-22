
import java.util.Scanner;
        
public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.nextLine());
            printUntilNumber(i);
                
    }
    public static void printUntilNumber(int number) {
        System.out.println(number);
        
    }
}
    