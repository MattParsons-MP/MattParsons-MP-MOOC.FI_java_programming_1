
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0);
        
        matAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(matAccount);
        System.out.println(myAccount);
        // Do not touch the code in Account.java
        // write your program here
    }
}
