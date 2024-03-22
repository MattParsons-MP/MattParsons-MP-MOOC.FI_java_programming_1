
public class HealthStation {
    private int visits;
    
    public HealthStation() {
        this.visits = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.visits += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int feed = 1+(person.getWeight());
        person.setWeight(feed);    
    }
    
    public int weighings() {
        int weighings = this.visits;
        return weighings;
    }

}
