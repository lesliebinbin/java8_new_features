package au.edu.uq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest2 {
    public void demo() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> evens = num -> num % 2 == 0;
        Predicate<Integer> odds = evens.negate();
        Predicate<Integer> evenAndLargerThan100 = evens.and(num -> num > 100);
        Predicate<Integer> oddsOrLessThan10 = odds.or(num -> num < 10);
        System.out.println(conditionFilter(list, evens));
        System.out.println("--------------------");
        System.out.println(conditionFilter(list, odds));
        System.out.println(conditionFilter(list, evenAndLargerThan100));
        System.out.println(conditionFilter(list, oddsOrLessThan10));
        System.out.println(Predicate.isEqual("test").test("test"));
    }

    public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        Map<String, String> map = new HashMap<>();
        map.put("leslie", "binbin");
        map.put("zhibin", "wong");
        map.put("tongtong", "wu");
        map.forEach((k, v) -> System.out.println(k + '=' + v));
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
