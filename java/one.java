import myPack.info;
import static java.lang.System.*;

public class one {
  public static void main(String args[]) {
    info.intro();
    // implicit castings
    byte byt = 2;
    short srt = byt;
    int nt = srt;
    float flt = nt;
    double dbl = flt;
    dbl = 25434.545345;
    // explicit casting
    flt = (float) dbl;
    nt = (int) flt;
    srt = (short) nt;
    byt = (byte) srt;
    out.println("flt : " + flt);
    out.println("nt : " + nt);
    out.println("srt : " + srt);
    out.println("byt : " + byt);
  }
}
