package datestuff;

public class Holiday extends Date {
  private String description;

  public Holiday(int day, int month, int year, String description) {
    super(day, month, year);
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  @Override
  public String toString() {
    return super.toString() + " is a Holiday called " + this.description;
  }
}
