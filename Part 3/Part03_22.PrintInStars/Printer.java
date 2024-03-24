
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int list: array) {
            System.out.println("");
            for (int i= 1; i<=list; i++ ) {
                System.out.print("*");
            }
        }
    }
}
