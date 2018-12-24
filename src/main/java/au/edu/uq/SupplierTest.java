package au.edu.uq;

import java.util.function.Supplier;

public class SupplierTest {
    public void demo(){
        Supplier<String> supplier = ()->"Fuck you";
        System.out.println(supplier.get());
    }
}
