import myPack.info;
import static java.lang.System.*;
import java.io.*;

public class six {
  public static void main(String args[]) {
    info.intro();
    Console cl = System.console();
    if (cl == null) {
      out.println("console not found");
      return;
    }
    // taking input from console
    cl.printf("Enter a number : ");
    float number = Float.parseFloat(cl.readLine());
    cl.printf("Enter a string : ");
    String s = cl.readLine();
    cl.printf("Enter you password : ");
    char[] pass = cl.readPassword();
    cl.printf("\number + 5 : %f", number);

    s = s + 5;
    cl.printf("\nstring + 5: %s", s);

    cl.printf("\npassword : ");
    out.println(pass);
  }
}
