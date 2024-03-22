
public class Main {

    public static void main(String[] args) {
        SimpleDate test = new SimpleDate(25, 02, 2004);
        
        SimpleDate test2 = test.afterNumberOfDays(91);
       
        System.out.println(test);
        test.advance(1);
        System.out.println(test);
        System.out.println(test2);
    }
}
    
    