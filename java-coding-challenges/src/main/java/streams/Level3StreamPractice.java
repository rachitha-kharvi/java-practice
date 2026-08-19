package streams;

import employee.Employee;
import employee.EmployeeData;

import java.util.List;

public class Level3StreamPractice {

    public static void main(String[] args) {

        List<Integer> nums = EmployeeData.getNumbers();
        List<String> names = EmployeeData.getNames();
        List<Employee> employees = EmployeeData.getEmployee();


        // =========================
        // NUMBER OPERATIONS
        // =========================

        Integer firstEven = nums.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .orElse(0);

        Integer anyEven = nums.stream()
                .filter(n -> n % 2 == 0)
                .findAny()
                .orElse(0);

        boolean anyEvenNumber = nums.stream()
                .anyMatch(n -> n % 2 == 0);

        boolean allEvenNumbers = nums.stream()
                .allMatch(n -> n % 2 == 0);

        boolean noNumberGreaterThan100 = nums.stream()
                .noneMatch(n -> n > 100);


        // =========================
        // EMPLOYEE OPERATIONS
        // =========================

        double firstEmployeeSalaryAbove50000 = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .mapToDouble(Employee::getSalary)
                .findFirst()
                .orElse(0);

        Employee anyEmployeeSalaryAbove90000 = employees.stream()
                .filter(e -> e.getSalary() > 90000)
                .findAny()
                .orElse(null);

        boolean anyEmployeeAbove40 = employees.stream()
                .anyMatch(e -> e.getAge() > 40);

        boolean allEmployeesSalaryAbove30000 = employees.stream()
                .allMatch(e -> e.getSalary() > 30000);

        boolean noEmployeeBelow18 = employees.stream()
                .noneMatch(e -> e.getAge() < 18);


        // =========================
        // PRINT NUMBER RESULTS
        // =========================

        System.out.println("===== NUMBER OPERATIONS =====");

        System.out.println("First even number: " + firstEven);

        System.out.println("Any even number: " + anyEven);

        System.out.println("Is there any even number? "
                + anyEvenNumber);

        System.out.println("Are all numbers even? "
                + allEvenNumbers);

        System.out.println("Is there no number greater than 100? "
                + noNumberGreaterThan100);


        // =========================
        // PRINT EMPLOYEE RESULTS
        // =========================

        System.out.println("\n===== EMPLOYEE OPERATIONS =====");

        System.out.println("First employee salary > 50000: "
                + firstEmployeeSalaryAbove50000);

        System.out.println("Any employee salary > 90000: "
                + anyEmployeeSalaryAbove90000);

        System.out.println("Any employee age > 40? "
                + anyEmployeeAbove40);

        System.out.println("All employees salary > 30000? "
                + allEmployeesSalaryAbove30000);

        System.out.println("No employee age < 18? "
                + noEmployeeBelow18);
    }
}