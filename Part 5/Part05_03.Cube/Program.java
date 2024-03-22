
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cube big = new Cube(4);
        System.out.println(big.volume());
        System.out.println(big);
        
        System.out.println();
        
        Cube small = new Cube(2);
        System.out.println(small.volume());
        System.out.println(small);
        

        // Experiment with your program here
    }
}
