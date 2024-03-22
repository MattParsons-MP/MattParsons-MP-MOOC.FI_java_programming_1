
public class StarSign {

    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printStars(int number) {
        for (int i=0; i<number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int i= 0; i<size; i++) {
            printStars(size);
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        for (int h= 0; h<height; h++) {
            printStars(width);    
        }
    }

    public static void printTriangle(int size) {
        for (int i= 1; i<=size; i++) {
            printStars(i);
        }
    }
}
