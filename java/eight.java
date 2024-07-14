
import myPack.info;
import static java.lang.System.*;

public class eight {
  public static void main(String args[]) {
    info.intro();
    int raggedArray[][] = {
        { 34, 5, 5, 3, 5 },
        { 23, 6, 87, 2 },
        { 23, 87, 34 },
        { 34, 3 },
        { 32, 5, 769, 98, 0, 067 }
    };
    // printing ragged array
    out.println("printing ragged array ");
    for (int i = 0; i < 5; i++) {
      for (int j : raggedArray[i])
        out.print(j + " ");
      out.println();
    }
  }
}
