
public class Main {

  public static void main(String[] args) {
      Song garden = new Song("In The Garden", 10910);
      System.out.println("The song " + garden.name() + " has a length " + garden.length() + " seconds.");
    // This is just an empty main method, where you can test your
    // Song class. You can for instance try this:

    // Song garden = new Song("In The Garden", 10910);
    // System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");

  }
}
