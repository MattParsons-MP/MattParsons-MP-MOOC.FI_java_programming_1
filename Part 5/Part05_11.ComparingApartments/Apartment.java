
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
            
        } else {
            return false;
        }
    }
    public int priceDifference(Apartment compared){
        int price = this.squares * this.pricePerSquare;
        int price2 = compared.squares*compared.pricePerSquare;
        int diff = price - price2;
        int diff2 = price2 - price;
        if (diff > 0) {
            return diff;
            
        } else {
            return diff2;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int price = this.squares * this.pricePerSquare;
        int price2 = compared.squares*compared.pricePerSquare;
        if (price > price2) {
            return true;
            
        } else {
            return false;
        }
        
    }

}
