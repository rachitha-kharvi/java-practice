package employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployee(){
        return List.of(
                new Employee("John", 28, 50000,"IT"),
                new Employee("Alex", 35, 80000,"HR"),
                new Employee("Ram", 24, 40000,"Accounting"),
                new Employee("Smith", 45, 100000,"IT"),
                new Employee("Amit", 30, 60000,"HR")
        );
    }
    public static List<Integer> getNumbers(){
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 5, 3);
    }
    public static List<String> getNames(){
        return Arrays.asList(
                "john",
                "ram",
                "smith",
                "alex",
                "john",
                "alex"
        );
    }

}
