package stream_api;

import java.util.Arrays;
import java.util.List;
 record Employee(Integer id, String name, Double salary) {
}
public class EmployeeNameSalaryGreatherThan {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "Rajendra", 50000D);
        Employee e2 = new Employee(222, "Rakesh", 60000D);
        Employee e3 = new Employee(333, "Ramesh", 72000D);
        Employee e4 = new Employee(444, "Raghab", 85000D);
        Employee e5 = new Employee(555, "Raghua", 91000D);

        // find the employees whose salary is greater than 60000
        List<Employee> listOfEmployee = Arrays.asList(e1, e2, e3, e4, e5);

        listOfEmployee.stream()
                .filter(emp -> emp.salary() > 60000)
                .forEach(System.out::println);
        /*
        // find employees whose salary is greater than 60000 and print only their names
        List<Employee> listOfEmployee = Arrays.asList(e1, e2, e3, e4, e5);

        listOfEmployee.stream()
                .filter(emp -> emp.salary() > 60000)
                .map(Employee::name)          // extract only the name
                .forEach(System.out::println);
        */
    }
}