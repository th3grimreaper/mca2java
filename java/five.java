import myPack.info;
import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class five {
  public static void main(String args[]) throws IOException {
    info.intro();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    out.print("Enter a number : ");
    float flt = Float.parseFloat(br.readLine());
    out.print("Enter string : ");
    String s = br.readLine();
    out.println("Number : + 5 : " + (flt + 5));
    out.println("String : + 9 : " + s + 9);
  }
}
