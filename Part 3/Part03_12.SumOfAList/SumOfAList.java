
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        System.out.println("");
        int sum = 0;
        for (Integer a: list) {
            sum = sum + a;
        }
        
        System.out.println("sum: " + sum);
    }
}
