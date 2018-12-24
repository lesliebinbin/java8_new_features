package au.edu.uq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

interface TheInterface01 {
  void myMethod();
}

interface TheInterface02 {
  void myMethod();
}

public class Demo02 {
  public void demo() {
    TheInterface01 i1 = () -> {
    };
    System.out.println(i1.getClass().getInterfaces()[0]);
    TheInterface02 i2 = () -> {
    };
    new Thread(() -> {
      System.out.println("thread demo....");
      System.out.println("thread demo....");
      System.out.println("thread demo....");
      System.out.println("thread demo....");
    }).start();

    System.out.println(i2.getClass().getInterfaces()[0]);
  }

  public void demo02() {
    List<String> list = Arrays.asList("hello", "world", "hello world");
    System.out.println(list);
    List<String> resultList = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    System.out.println(resultList);
    List<String> list2 = new ArrayList<>();
    list.forEach(e -> list2.add(e.toUpperCase()));
    System.out.println(list2);
    Set<String> resultSet = list.stream().map(String::toUpperCase).collect(Collectors.toSet());
    System.out.println(resultSet);
  }

  public void demo03() {
    List<String> list = Arrays.asList("hello", "world", "hello world");
    list.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
  }

  public void demo04() {
    Function<String, String> function = String::toUpperCase;
    System.out.println(function.getClass().getInterfaces()[0]);
  }
}
