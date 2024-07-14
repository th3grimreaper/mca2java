import myPack.info;

class ParentClass {
  void displayParent() {
    System.out.println("Parent class method");
  }
}

class ChildClass extends ParentClass {
  void displayChild() {
    System.out.println("Child class method");
  }
}

public class fourteen {
  public static void main(String[] args) {
    info.intro();
    // Single inheritance demonstration
    ChildClass obj = new ChildClass();
    obj.displayParent();
    obj.displayChild();
  }
}
