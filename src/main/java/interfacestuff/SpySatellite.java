package interfacestuff;

public class SpySatellite implements Photographer {
  @Override
  public String takePhoto(String subject) {
    return "bleep bleep... grainy picture of "
        + subject + " from above";
  }
}
