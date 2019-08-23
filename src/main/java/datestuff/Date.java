package datestuff;

public class Date {
  // protected -- accessible from subclasses
  // no keyword (private, protected, nor publid) implies
  // accessible in the same package
  private int day;
  private int month;
  private int year;

// bad idea, what date is "0/0/0000" ??
//  public Date() {}

  public Date(int day, int month, int year) {
    if (day < 1 || day > 31 || month < 1 || month > 12) {// problem??
      throw new IllegalArgumentException("Bad date values");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // day of week is 0-Saturday through 6-Friday
  // no "named parameters" only positional!!!
  // no default parameters (but have "overloading"
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year -= 1;
    }
    return (day + (13 * (month + 1) / 5) + year + year/4 - year/100 + year/400) % 7;
  }

  public static int getDay(Date d) {
    return d.day;
  }

  public int getDay() {
    return this.day;
  }

  // Ultimate base class called java.lang.Object defines toString
  @Override
  public String toString() {
    return "Date: day=" + this.day + " month="
        + this.month + " year=" + this.year;
  }

  @Override
  public boolean equals(Object other) {
    if (other instanceof Date) {
      Date d2 = ((Date)other);
      return this.day == d2.day
          && this.month == d2.month
          && this.year == d2.year;
    } else return false;
  }
  // method overload (might fake default args)
  public static int dayOfWeek(int month, int year) {
    return dayOfWeek(1, month, year);
  }


}
