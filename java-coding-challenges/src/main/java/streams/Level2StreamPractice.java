package streams;

import employee.Employee;
import employee.EmployeeData;

import java.util.Comparator;
import java.util.List;

public class Level2StreamPractice {

    public static void main(String[] args) {

        List<Integer> nums = EmployeeData.getNumbers();
        List<String> names = EmployeeData.getNames();
        List<Employee> employees = EmployeeData.getEmployee();

        // =========================
        // NUMBER OPERATIONS
        // =========================

        long evenCount = nums.stream()
                .filter(n -> n % 2 == 0)
                .count();

        int max = nums.stream()
                .max(Integer::compareTo)
                .orElse(0);

        int min = nums.stream()
                .min(Integer::compareTo)
                .orElse(0);

        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        int evenSum = nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();


        // =========================
        // STRING OPERATIONS
        // =========================

        long nameStartsWithACount = names.stream()
                .filter(name -> name.startsWith("a"))
                .count();


        // =========================
        // EMPLOYEE OPERATIONS
        // =========================

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        Employee highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        Employee lowestSalaryEmployee = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);


        // =========================
        // PRINT RESULTS
        // =========================

        System.out.println("===== NUMBER OPERATIONS =====");

        System.out.println("Even count: " + evenCount);
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Sum of even numbers: " + evenSum);


        System.out.println("\n===== STRING OPERATIONS =====");

        System.out.println("Names starting with 'a': "
                + nameStartsWithACount);


        System.out.println("\n===== EMPLOYEE OPERATIONS =====");

        System.out.println("Average salary: " + averageSalary);

        System.out.println("Highest salary employee: "
                + highestSalaryEmployee);

        System.out.println("Lowest salary employee: "
                + lowestSalaryEmployee);
    }
}