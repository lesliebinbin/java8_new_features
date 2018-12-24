package au.edu.uq;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo01 {
    public Integer compute01(Integer a, Integer b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }

    public Integer compute02(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
