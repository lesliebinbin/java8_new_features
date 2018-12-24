package au.edu.uq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {
    public void demo() {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");
        Employee employee2 = new Employee();
        employee2.setName("lisi");
        Company company = new Company();
        company.setName("company1");
        List<Employee> employees = Arrays.asList(employee1, employee2);
        company.setEmployees(employees);
        Optional<Company> optionalCompany = Optional.ofNullable(company);
        List<Employee> result = optionalCompany.map(com -> com.getEmployees()).orElse(Collections.emptyList());
        System.out.println(result);
    }
}
