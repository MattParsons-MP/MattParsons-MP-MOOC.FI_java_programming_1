
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        int numberCount = 0;
        this.count = numberCount;
        this.sum = 0;
        
    }
    public void addNumber(int number) {
        this.sum = sum + number;
        count++;
    }
    public int getCount() {
        return count;  
    }
    public int sum() {
        return sum;
    }
    public double average() {
        double avg;
        if (count == 0) { 
            avg = 0;
        } else {
            avg = 1.0*sum/count;
        } 
        return avg;
        
    }

    
}
