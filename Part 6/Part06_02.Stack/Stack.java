import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();   
    }
    
    public boolean isEmpty() {
       return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(value);
        
    }
    
    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (int i= 0; i < list.size(); i++) {
        String value = list.get(i);
        values.add(value);
        }
        return values;
    }
    
    public String take() {
        return list.remove(list.size()-1);
    }
}
