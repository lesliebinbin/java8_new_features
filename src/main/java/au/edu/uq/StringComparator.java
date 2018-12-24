package au.edu.uq;

import java.util.*;

public class StringComparator {
  public void sortDemo() {
    List<String> names = Arrays.asList("zhansan", "lisi", "wangwu", "zhaoliu");
/*    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    });*/
    List<String> namesCopied = new ArrayList<>(names);
    Collections.sort(names, Comparator.reverseOrder());
    Collections.sort(namesCopied, String::compareTo);
    System.out.println(names);
    System.out.println(namesCopied);
    System.out.println(names == namesCopied);
  }
}
