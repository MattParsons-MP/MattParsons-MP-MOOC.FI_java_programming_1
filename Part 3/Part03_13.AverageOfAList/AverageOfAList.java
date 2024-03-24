
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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
        double avg = (1.0*sum)/(1.0*list.size());
        
        System.out.println("Average: " + avg);
    }
}
