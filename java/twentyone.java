import AnimalPack.Dog;
import AnimalPack.Cat; // imported two classes from AnimalPack
import myPack.info;

public class twentyone {
  public static void main(String arg[]) {
    info.intro();
    Dog dg = new Dog("Doggu", "Alex");
    dg.print();
    System.out.println();
    Cat ct = new Cat("Kittu", "Michi");
    ct.print();
  }
}
