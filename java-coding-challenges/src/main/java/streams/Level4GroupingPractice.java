package streams;

import employee.Employee;
import employee.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Level4GroupingPractice {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployee();


        // ============================================
        // 1. GROUP EMPLOYEES BY DEPARTMENT
        // ============================================

        Map<String, List<Employee>> employeesByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("===== EMPLOYEES BY DEPARTMENT =====");

        employeesByDepartment.forEach((department, employeeList) ->
                System.out.println(department + " -> " + employeeList));


        // ============================================
        // 2. COUNT EMPLOYEES PER DEPARTMENT
        // ============================================

        Map<String, Long> employeeCountByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        ));

        System.out.println("\n===== EMPLOYEE COUNT BY DEPARTMENT =====");

        employeeCountByDepartment.forEach((department, count) ->
                System.out.println(department + " -> " + count));


        // ============================================
        // 3. AVERAGE SALARY PER DEPARTMENT
        // ============================================

        Map<String, Double> averageSalaryByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        System.out.println("\n===== AVERAGE SALARY BY DEPARTMENT =====");

        averageSalaryByDepartment.forEach((department, averageSalary) ->
                System.out.println(department + " -> " + averageSalary));


        // ============================================
        // 4. SUM SALARY PER DEPARTMENT
        // ============================================

        Map<String, Double> totalSalaryByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingDouble(Employee::getSalary)
                        ));

        System.out.println("\n===== TOTAL SALARY BY DEPARTMENT =====");

        totalSalaryByDepartment.forEach((department, totalSalary) ->
                System.out.println(department + " -> " + totalSalary));


        // ============================================
        // 5. EMPLOYEE NAMES BY DEPARTMENT
        // ============================================

        Map<String, List<String>> employeeNamesByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(
                                        Employee::getName,
                                        Collectors.toList()
                                )
                        ));

        System.out.println("\n===== EMPLOYEE NAMES BY DEPARTMENT =====");

        employeeNamesByDepartment.forEach((department, names) ->
                System.out.println(department + " -> " + names));


        // ============================================
        // 6. HIGHEST SALARY EMPLOYEE BY DEPARTMENT
        // ============================================

        Map<String, Optional<Employee>> highestSalaryByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(
                                        Comparator.comparing(Employee::getSalary)
                                )
                        ));

        System.out.println("\n===== HIGHEST SALARY BY DEPARTMENT =====");

        highestSalaryByDepartment.forEach((department, employee) ->
                System.out.println(department + " -> " + employee));


        // ============================================
        // 7. LOWEST SALARY EMPLOYEE BY DEPARTMENT
        // ============================================

        Map<String, Optional<Employee>> lowestSalaryByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.minBy(
                                        Comparator.comparing(Employee::getSalary)
                                )
                        ));

        System.out.println("\n===== LOWEST SALARY BY DEPARTMENT =====");

        lowestSalaryByDepartment.forEach((department, employee) ->
                System.out.println(department + " -> " + employee));


        // ============================================
        // 8. GROUP EMPLOYEES BY SALARY RANGE
        // ============================================

        Map<String, List<Employee>> employeesBySalaryRange =
                employees.stream()
                        .collect(Collectors.groupingBy(employee -> {

                            if (employee.getSalary() < 50000) {
                                return "LOW";
                            }

                            if (employee.getSalary() <= 80000) {
                                return "MEDIUM";
                            }

                            return "HIGH";
                        }));

        System.out.println("\n===== EMPLOYEES BY SALARY RANGE =====");

        employeesBySalaryRange.forEach((range, employeeList) ->
                System.out.println(range + " -> " + employeeList));


        // ============================================
        // 9. GROUP EMPLOYEES BY AGE CATEGORY
        // ============================================

        Map<String, List<Employee>> employeesByAgeCategory =
                employees.stream()
                        .collect(Collectors.groupingBy(employee -> {

                            if (employee.getAge() < 30) {
                                return "YOUNG";
                            }

                            if (employee.getAge() <= 40) {
                                return "MID";
                            }

                            return "OLD";
                        }));

        System.out.println("\n===== EMPLOYEES BY AGE CATEGORY =====");

        employeesByAgeCategory.forEach((category, employeeList) ->
                System.out.println(category + " -> " + employeeList));


        // ============================================
        // 10. COUNT EMPLOYEES BY AGE CATEGORY
        // ============================================

        Map<String, Long> employeeCountByAgeCategory =
                employees.stream()
                        .collect(Collectors.groupingBy(employee -> {

                            if (employee.getAge() < 30) {
                                return "YOUNG";
                            }

                            if (employee.getAge() <= 40) {
                                return "MID";
                            }

                            return "OLD";
                        }, Collectors.counting()));

        System.out.println("\n===== EMPLOYEE COUNT BY AGE CATEGORY =====");

        employeeCountByAgeCategory.forEach((category, count) ->
                System.out.println(category + " -> " + count));
    }
}