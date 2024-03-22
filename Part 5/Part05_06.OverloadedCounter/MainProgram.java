
public class MainProgram {

    public static void main(String[] args) {
        Counter first = new Counter(5);
        
        
        first.increase();
        first.increase();
        System.out.println(first);  
        
        first.decrease();
        System.out.println(first);
        
        System.out.println(first.value());
        
        first.increase(10);
        first.decrease(5);
        
        System.out.println(first);
        
        
        // Test your counter here
    }
}
