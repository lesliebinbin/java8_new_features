package au.edu.uq;

import java.util.function.Predicate;

public class PredicateTest {
    public void demo(){
        Predicate<String> predicate = str->str.length()>5;
        System.out.println(predicate.test("hello"));
        System.out.println(predicate.test("hello world"));
    }
}
