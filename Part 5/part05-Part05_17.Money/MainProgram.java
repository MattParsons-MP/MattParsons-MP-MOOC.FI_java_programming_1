
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(2, 5);
        Money b = new Money(2, 0);
        
        Money c = a.minus(b);
        System.out.println(c);
        System.out.println(a.lessThan(b));
        

        //System.out.println(a);  // 10.00e
        //System.out.println(b);  // 3.50e
        //System.out.println(c);  // 6.50e
        //System.out.println(a);  // 10.00e
        //System.out.println(b);  // 3.50e
        //System.out.println(c);  // 0.00e
    }
}
