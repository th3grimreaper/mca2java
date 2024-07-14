import static java.lang.System.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import myPack.info;

public class three {
  public static void main(String args[]) {
    info.intro();
    Date currentDate = new Date();
    SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat f2 = new SimpleDateFormat("dd-MMM-yyyy");
    SimpleDateFormat f3 = new SimpleDateFormat("MMM dd yyyy");
    System.out.println("Current date in format1 : " + f1.format(currentDate));
    System.out.println("Current date in format2 : " + f2.format(currentDate));
    System.out.println("Current date in format3 : " + f3.format(currentDate));
  }
}
