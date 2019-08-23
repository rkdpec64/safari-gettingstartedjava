package checkedexception;

import java.io.*;

public class Example {
  public static Reader openFile(String name) throws FileNotFoundException {
    return new FileReader("data.txt");
  }

  public static void main(String[] args) {
    try {
      Reader in = openFile("data.txt");
      BufferedReader br = new BufferedReader(in);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println("> " + line);
      }
      // ...
    } catch (FileNotFoundException fnfe) { // more specific exceptions listed first!
      System.out.println("File wasn't found: " +fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("Trouble reading the file");
    }
  }
}
