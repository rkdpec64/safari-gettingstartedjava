package datestuff;

public class UseDate {
  // variable length arguments "faked" using arrays under the hood
  public static void showAll(String message, int ... values) {
    System.out.print(message);
    for (int x : values) {
      System.out.print(x + ", ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int day = 1, month = 1, year = 2000;
    System.out.println("day number of 1,1,2000 is "
        + datestuff.Date.dayOfWeek(day, month, year)); // explicit scoping
//        + dayOfWeek(day, month, year));  // default scope works in previous case

    System.out.println("first of 8, 2019 " + Date.dayOfWeek(8, 2019));

    showAll("three numbers: ", 1, 2, 3);
    showAll("five numbers: ", 1, 2, 3, 4, 5);
    showAll("zero numbers: ");

//    Date bad = new Date();
    Date today = new Date(23, 8, 2019);
    Date today2 = new Date(23, 8, 2019);
    // private cannot be accessed from outside
//    today.day = 23;
//    today.month = 8;
//    today.year = 2019;
    System.out.println("day: " + Date.getDay(today));
    System.out.println("day: " + today.getDay());
    System.out.println("Date is " + today);

    System.out.println("dates equal? " + (today.equals(today2)));
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println("strings equal? " + (s1 == s2));
    System.out.println("strings equal? " + (s1.equals(s2)));

    try {
      Date badDate = new Date(32, 8, 2019);
    } catch (IllegalArgumentException iae) {
      System.out.println("Oops that broke, message is " + iae.getMessage());
    }
    System.out.println("continuing normal execution");

    Holiday h = new Holiday(1, 1, 2020, "New Year's Day");
    System.out.println("holiday is " + h);
    System.out.println("day of holiday is " + h.getDay());
    System.out.println("description is " + h.getDescription());
  }
}
