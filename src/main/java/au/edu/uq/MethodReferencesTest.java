package au.edu.uq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * MethodReferencesTest
 */
public class MethodReferencesTest {

    public void demo() {
        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjin", "beijing");
        Collections.sort(cities, String::compareToIgnoreCase);
        System.out.println(cities);
    }
}