package au.edu.uq;

import java.util.function.Supplier;

public class StudentTest {
    public void demo() {
//        Supplier<Student> supplier = () -> new Student();
//        for (Long i = 0L; i < 1000_000_000_000L; i++) {
//            supplier.get();
//        }
        System.out.println("-------------");
        Supplier<Student> supplier2 = Student::new;
        for (int i = 0; i < 1000; i++) {
            supplier2.get();
        }
    }
}
