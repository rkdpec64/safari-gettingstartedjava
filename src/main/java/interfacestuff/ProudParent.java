package interfacestuff;

public class ProudParent implements Photographer {
  @Override
  public String takePhoto(String subject) {
    return "Cute picture of " + subject
        + " with trash can in background";
  }

  public void goToWork() {
    System.out.println("Spending day saying nice things to customers");
  }
}
