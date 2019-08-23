package programflow;

public class Conditions {
  public static void main(String[] args) {
    int x = 999;
    int y = 100;

    if (x > y) {
      System.out.println("gosh, x is greater than y");
    } else if (x == y) {
      System.out.println("oh, they're equal...");
    } else {
      System.out.println("Oh, it's not greater");
      System.out.println("that's so sad...");
    }

    switch (x) {
      case 9:  // jumps to matching case...
        System.out.println("x is nine");
        break;
      case 10:
        System.out.println("x is ten");
        break;
      default:
        System.out.println("It's none of my matches");
        break;
      case 11:
        System.out.println("it's eleven");
        break;
    }
  }
}
