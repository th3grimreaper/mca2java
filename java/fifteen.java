import myPack.info;

class ParentClass {
  void display() {
    System.out.println("Parent class method");
  }
}

class ChildClass extends ParentClass {
  void display() {
    super.display(); // Calls the parent class method
    System.out.println("Child class method");
  }
}

public class fifteen {
  public static void main(String[] args) {
    info.intro();
    ChildClass obj = new ChildClass();
    obj.display();
  }
}
