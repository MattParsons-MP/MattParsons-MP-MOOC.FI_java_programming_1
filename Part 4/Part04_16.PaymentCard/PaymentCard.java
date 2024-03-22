/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hol
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        
    }
    public void eatAffordably() {
        double a = 2.6;
        if (this.balance < 2.6) {
            this.balance = balance;
        } else {
            this.balance = balance - a;    
        }
    }
    public void eatHeartily() {
        double a = 4.6;
        if (this.balance < 4.6) {
            this.balance = balance;
        } else {
        this.balance = balance - a;
        }
        
    }
    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance = balance + amount;
            if (this.balance > 150) {
                this.balance = 150;
        } else {
                this.balance = balance;
            
            }
        }
        
    }
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
}
