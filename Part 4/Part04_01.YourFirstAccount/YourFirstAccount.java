
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
    Account mattAccount = new Account("Matt's account", 100.00);
        System.out.println("Initial state");
        System.out.println(mattAccount);
        
    
    mattAccount.deposit(20);
        System.out.println(mattAccount);
    //System.out.println("The balance of Matt's Account is now: " + mattAccount.saldo());
    
    }
}
