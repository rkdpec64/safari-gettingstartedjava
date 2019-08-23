package interfacestuff;

import java.util.Arrays;
import java.util.List;

public class UsePhotographer {
  public static void main(String[] args) {
    ProudParent pp = new ProudParent();
//    Photographer pp = new ProudParent();
    pp.goToWork();
//    System.out.println(pp.takePhoto("Jeremy"));

//    SpySatellite ss = new SpySatellite();
    Photographer ss = new SpySatellite();
//    System.out.println(ss.takePhoto("Jeremy"));
//    ss.goToWork(); // NO! Only for parent...

    List<Photographer> lp = Arrays.asList(pp, ss);
    for (Photographer p : lp) {
      System.out.println("Found a photographer "
          + (p.getClass().getName()));
      System.out.println(p.takePhoto("Jeremy"));
    }
  }
}
