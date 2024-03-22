import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            System.out.println("Name: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int dur = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(input, dur));
        }
        System.out.println("Program's maximum duration?");
        int limit = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= limit) {
                System.out.println(program.getName() + "," + program.getDuration());
                
            }
        }
        
        
        

    }
}
