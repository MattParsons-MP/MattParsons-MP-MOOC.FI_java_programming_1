
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard cardPaul = new PaymentCard(20);
        PaymentCard cardMatt = new PaymentCard(30);
        
        cardPaul.eatHeartily();
        cardMatt.eatAffordably();
      
        System.out.println("Paul's: " + cardPaul);
        System.out.println("Matt's: " + cardMatt);
        
        cardPaul.addMoney(20);
        
        cardMatt.eatHeartily();
        
        System.out.println("Paul's: " + cardPaul);
        System.out.println("Matt's: " + cardMatt);
        
        cardPaul.eatAffordably();
        cardPaul.eatAffordably();
        
        cardMatt.addMoney(50);
        
        System.out.println("Paul's: " + cardPaul);
        System.out.println("Matt's: " + cardMatt);
        
        
        
        //card.addMoney(10);
        //System.out.println(card);
        
        //card.addMoney(200);
        //System.out.println(card);
        //card.eatHeartily();
        //System.out.println(card);
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}
