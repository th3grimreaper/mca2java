import myPack.info;

public class twenty {
  public static void main(String[] args) {
    info.intro();
    // Calling method with local class
    displayMessage();
  }

  static void displayMessage() {
    System.out.println("Inside method");
    // Local class definition
    class Local {
      void localMethod() {
        System.out.println("Inside local method");
      }
    }
    // Creating object of Local class
    Local local = new Local();
    local.localMethod();
  }
}
