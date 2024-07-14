import myPack.info;

public class nineteen {
  public static void main(String[] args) {
    info.intro();
    // Creating object of Outer class
    Outer outer = new Outer();
    // Accessing inner class method
    outer.display();
  }

  static class Outer {
    void display() {
      System.out.println("Inside Outer class method");
      // Inner class definition
      class Inner {
        void innerMethod() {
          System.out.println("Inside Inner class method");
        }
      }
      // Creating object of Inner class
      Inner inner = new Inner();
      inner.innerMethod();
    }
  }
}
