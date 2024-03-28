
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        
        String printFirst = "The collection " + this.name;
        
        if (elements.isEmpty()) {
            return printFirst + " is empty.";
        }
            
        String values = "";
        
        for (String element : elements) {
            if (elements.size()==1) {
                values = element;
            } else {
                values = values + element + "\n";
            }
        }
        
        String elementCall = "";
        
        if (elements.size() == 1) {
            elementCall = " element:";
                      
        } else {
            elementCall = " elements:";
        }
       
        return printFirst + " has " + elements.size() + elementCall + "\n" + values;
    }
}
