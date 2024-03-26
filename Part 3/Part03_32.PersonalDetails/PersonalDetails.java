
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double counter = 0;
        String longest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            double year = 1.0*(Integer.valueOf(parts[1]));
            sum = sum + year;
            counter++;
            if (longest.length()<parts[0].length()) {
                longest = parts[0];
            }
        }
        System.out.println("Average Birth years; " + (sum/counter));
        System.out.println("Longest name: " + longest);
    }
}
