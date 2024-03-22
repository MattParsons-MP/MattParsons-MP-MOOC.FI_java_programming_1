
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i=0; i<number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i=1; i<=number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        for (int i= size; i>0; i--){
            printSpaces(i-1);
            printStars(counter);
            counter++;
        }
    }

    public static void christmasTree(int height) {
        // printSpaces & printStars
        int counter = 1;
        for (int i= height; i>0; i--){
            printSpaces(i-1);
            printStars(counter);
            counter+=2;
        }
        // height is always the mid point of the triangle base
        // Last space always prints two before the mid point (height -2)
        
        printSpaces(height-2);       // print spaces 
        printStars(3);               // print 3 stars
        
        printSpaces(height-2);       // rinse and repeat
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        //printTriangle(5);
        //System.out.println("---");
        //christmasTree(4);
        //System.out.println("---");
        christmasTree(10);
    }
}
