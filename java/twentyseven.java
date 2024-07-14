import myPack.info;

class myOwnException extends Exception {
  myOwnException() {
    super("your own exception occurred >_<");
  }
}

public class twentyseven {
  public static void main(String[] args) {
    info.intro();
    try {
      throw new myOwnException();
    } catch (myOwnException e) {
      System.err.println(e);
    }
  }
}
