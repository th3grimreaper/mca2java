import myPack.info;

class Counter implements Runnable {
  char ch;

  Counter(char c) {
    ch = c;
  }

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.printf("%c%d\n", ch, i);
    }
    System.out.println("Executed thread " + ch);
  }
}

public class twentynine {
  public static void main(String[] args) {
    info.intro();
    Thread ct1 = new Thread(new Counter('a'));
    Thread ct2 = new Thread(new Counter('b'));
    Thread ct3 = new Thread(new Counter('c'));
    ct1.start();
    ct2.start();
    ct3.start();
  }
}
