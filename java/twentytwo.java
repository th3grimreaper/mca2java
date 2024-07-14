import myPack.info;

public class twentytwo {
  public static void main(String args[]) {
    info.intro();
    int arr[] = { 3, 4, 5, 7, 8 };
    try {
      for (int i = 0; i <= 5; i++) {
        System.err.print(arr[i] + " ");
      }
    } catch (IndexOutOfBoundsException e) {
      System.err.println("\nException caught : ");
      e.printStackTrace();
    }

  }
}
