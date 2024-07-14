import myPack.info;

public class twentysix {
  public static void main(String args[]) {
    info.intro();
    int arr[] = { 3, 4, 5, 7, 8 };
    try {
      for (int i = 0; i < 5; i++) {
        System.err.print(arr[i] + " ");
      }
      try {
        float div = arr[0] / (9 - 5 - 4);
        System.out.println("div : " + div);
      } catch (ArithmeticException e) {
        e.printStackTrace();
      }
    } catch (IndexOutOfBoundsException e) {
      System.err.println("\nException caught : ");
      e.printStackTrace();
    }

  }
}
