package au.edu.uq;

import java.util.function.Function;

public class FunctionTest02 {
    public int compute(Integer a, Function<Integer, Integer> function01, Function<Integer, Integer> function2) {
        return function01.compose(function2).apply(a);
    }

    public int compute2(Integer a, Function<Integer, Integer> function01, Function<Integer, Integer> function02) {
        return function01.andThen(function02).apply(a);
    }
}
