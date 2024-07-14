import myPack.info;

class DemoConstOverloading {
  // Constructor overloading
  DemoConstOverloading() {
    System.out.println("Default constructor");
  }

  DemoConstOverloading(int x) {
    System.out.println("Parameterized constructor with one parameter: " + x);
  }

  DemoConstOverloading(int x, String str) {
    System.out.println("Parameterized constructor with two parameters: " + x + ", " + str);
  }
}

public class thirteen {
  public static void main(String[] args) {
    info.intro();

    new DemoConstOverloading();
    new DemoConstOverloading(5);
    new DemoConstOverloading(5, "Hello");
  }
}
