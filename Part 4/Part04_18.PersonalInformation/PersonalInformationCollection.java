
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First name: ");
            String fname = scanner.nextLine() ;
            if (fname.isEmpty()) {
                break;
            }
            System.out.println("Last name: ");
            String lname = scanner.nextLine();
            
            System.out.println("Identification number: ");
            String id = scanner.nextLine(); 
            
            infoCollection.add(new PersonalInformation(fname, lname, id));
            }
        
        for (PersonalInformation a: infoCollection) {
            System.out.println(a.getFirstName() + " " + a.getLastName());
        }
        
        //OR THIS!//
        //for (int i = 0; i < infoCollection.size(); i ++) {
        //    System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        //}
        //}
        //info
        //PersonalInformation.getFirstName
        //String firstname = infoCollection.getFirstName;
        
        //System.out.println(PersonalInformation(i));
    

    }
}
