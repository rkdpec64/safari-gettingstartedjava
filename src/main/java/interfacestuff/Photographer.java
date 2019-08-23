package interfacestuff;

// prior to Java 8, interface were entirely abstract
// since Java 8, they can have real methods (some restrictions)
// but still NO DATA fields
public interface Photographer {
  /*public abstract*/ String takePhoto(String subject);
}
