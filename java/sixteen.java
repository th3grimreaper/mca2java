import myPack.info;

class GrandParentClass {
  void displayGrandParent() {
    System.out.println("GrandParent class method");
  }
}

class ParentClass extends GrandParentClass {
  void displayParent() {
    System.out.println("Parent class method");
  }
}

class ChildClass extends ParentClass {
  void displayChild() {
    System.out.println("Child class method");
  }
}

public class sixteen {
  public static void main(String[] args) {
    info.intro();
    // Multilevel inheritance demonstration
    ChildClass obj = new ChildClass();
    obj.displayGrandParent();
    obj.displayParent();
    obj.displayChild();
  }

}
