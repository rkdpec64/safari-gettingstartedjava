package programflow;

import java.util.ArrayList;
import java.util.List;

public class Loops {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      x--; // or --x;
    }

     //do {} while (boolean);

    for (int counter = 0 ; counter < 3 ; counter++) {
      System.out.println("for has counter of " + counter);

//      int [] nums; // nums is a "reference" , or kind of pointer
//      nums = new int[2]; // arrays are zero-based indexes

      int [] nums = { 1, 1, 2, 3, 5 };
      for (int idx = 0; idx < nums.length; idx++) {
        System.out.println("nums[" + idx + "] is " + nums[idx]);
      }

      // List is an "interface" not a class
      List<String> names = new ArrayList<>();
      System.out.println("size of names is " + names.size());
      names.add("Fred");
      names.add("Jim");
      names.add("Sheila");
      System.out.println("size of names is " + names.size());
      for (String s : names) {
        System.out.println("I have a string: " + s);
      }

      // NO "operator overloading" so no [] for lists
      System.out.println("the second name is " + names.get(1));
    }
  }
}
