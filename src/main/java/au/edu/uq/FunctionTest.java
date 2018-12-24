package au.edu.uq;

import java.util.function.Function;

public class FunctionTest {
    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
