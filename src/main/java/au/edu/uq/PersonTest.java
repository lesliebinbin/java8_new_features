package au.edu.uq;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonTest {
    public void demo() {
        Person person01 = new Person("zhangsan", 20);
        Person person02 = new Person("lisi", 30);
        Person person03 = new Person("wangwu", 40);
        List<Person> persons = Arrays.asList(person01, person02, person03);
        /*System.out.println(getPersonByUsername("lisi", persons));
        System.out.println(getPersonByAge(20, persons));*/
        System.out.println(getPersonsByPredicate(p -> p.getAge() > 20, persons));
        System.out.println(getPersonsByPredicate(p -> "wangwu".equals(p.getName()), persons));
        System.out.println("---------------------");
        System.out.println(getPersonsByPredicate(p -> p.getAge() > 30 || "lisi".equals(p.getName()), persons));
        System.out.println("---------------------");
        System.out.println(getPersonsAllinOne(
                persons,
                p -> p.getAge() > 20 || "zhangsan".equals(p.getName()),
                ((predicate, peoples) -> peoples.stream().filter(predicate).collect(Collectors.toList()))));
        System.out.println("---------------------");
    }

    public List<Person> getPersonByUsername(final String username, final List<Person> persons) {
        return persons.stream().filter(person -> person.getName().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(final Integer age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunc = (a, pList) -> pList.stream().filter(p -> p.getAge() > age).collect(Collectors.toList());
        return biFunc.apply(age, persons);
    }

    public List<Person> getPersonsByPredicate(Predicate<Person> predicate, List<Person> persons) {
        BiFunction<Predicate<Person>, List<Person>, List<Person>> biFunc = (p, pList) -> pList.stream().filter(p).collect(Collectors.toList());
        return biFunc.apply(predicate, persons);
    }

    public List<Person> getPersonsAllinOne(List<Person> persons, Predicate<Person> predicate, BiFunction<Predicate<Person>, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(predicate, persons);
    }
}
