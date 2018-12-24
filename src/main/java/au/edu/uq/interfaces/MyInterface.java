package au.edu.uq.interfaces;

@FunctionalInterface
public interface MyInterface {
  void test();

  default void test02() {
    System.out.println("Fuck you...");
  }

  String toString();
}
