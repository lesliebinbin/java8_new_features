package au.edu.uq;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * BinaryOperatorTest
 */
public class BinaryOperatorTest {
    public void demo() {
        System.out.println(compute(1, 2, (a, b) -> a + b));
        System.out.println(compute(3, 4, (a, b) -> a - b));
        System.out.println("--------------");
        System.out.println(getShort("hello123", "world", Comparator.comparingInt(String::length)));
        Comparator<Integer> comp = Comparator.comparingInt(a -> a);
        System.out.println(BinaryOperator.maxBy(comp).apply(13, 14));
    }

    public Integer compute(Integer a, Integer b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}