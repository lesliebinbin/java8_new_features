package au.edu.uq;

import java.util.Optional;

public class OptionalTest {
    public void demo() {
        Optional<String> optional = Optional.empty();
        optional.ifPresent(System.out::println);
        System.out.println("----------------");
        System.out.println(optional.orElse("Fuck you..."));
        System.out.println(optional.orElseGet(()->"What is a supplier"));
        System.out.println(optional.orElseThrow(()->new RuntimeException("Fuck you, it is null...")));
    }
}
