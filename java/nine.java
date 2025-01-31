import myPack.info;
import static java.lang.System.*;

public class nine {
  static void printArray(int arr[]) {
    for (int i : arr)
      out.print(i + " ");
  }

  static float getAvg(int arr[]) {
    int sum = 0;
    for (int i : arr)
      sum += i;
    return sum / arr.length;
  }

  public static void main(String args[]) {
    info.intro();

    out.println("Array elements : ");
    printArray(new int[] { 3, 4, 5, 6, 7, 8, 9, 12 });
    out.println("\nAvg : " + getAvg(new int[] { 3, 4, 5, 6, 7, 8, 9, 12 }));
  }
}
