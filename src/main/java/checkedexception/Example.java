package checkedexception;

import java.io.*;

public class Example {
  public static Reader openFile(String name) throws FileNotFoundException {
    return new FileReader("data.txt");
  }

  public static void main(String[] args) {
    try ( // try-with-resources (since Java 7)
          // these objects are "closed" automatically
          // resources must "implement AutoCloseable"
        Reader in = openFile("data.txt");
        BufferedReader br = new BufferedReader(in);
    ) {
//      Reader in = openFile("data.txt");
//      BufferedReader br = new BufferedReader(in);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println("> " + line);
      }
//      br.close(); // not reliable, what if we skip out with
      // an exception?
      // ...
    } catch (FileNotFoundException fnfe) { // more specific exceptions listed first!
      System.out.println("File wasn't found: " +fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("Trouble reading the file");
    } finally {
//      br.close(); // out of scope!!!
      // if you start the associated try block, then
      // code in here (the finally) is executed regardless of
      // exception or success flow.
      // Intended for reliable closing of stuff like files...
    }
  }
}
