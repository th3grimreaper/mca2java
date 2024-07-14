import myPack.info;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void show() {
    System.out.println("Person name : " + name);
    System.out.println("Person age : " + age);
  }

  void eat() {
    System.out.println(name + " is eating rice and curry");
  }
}

public class eleven {
  public static void main(String args[]) {

    info.intro();

    Person a = new Person("Sai Praveen", 24);
    Person b = new Person("Siddhant Agrawal", 24);

    a.show();
    a.eat();
    System.out.println();
    b.show();
    b.eat();
  }
}
