/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madmo
 */
public class Fitbyte {
    private int age;
    private int restRate;
    
    public Fitbyte (int age, int restingHeartRate) {
        this.age = age;
        this.restRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double max = 206.3 - (0.711 * this.age);
        double calc = (max - this.restRate) * (percentageOfMaximum) + this.restRate;
        return calc;
      
    }
    
    
}
