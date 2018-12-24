package au.edu.uq;

import au.edu.uq.interfaces.MyInterface;

import java.util.Arrays;
import java.util.List;

public class Demo01 {
  public void demo() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    list.forEach(System.out::println);
  }
  public void myTest(MyInterface myInterface){
    System.out.println(1);
    myInterface.test();
    System.out.println(2);
  }
}
