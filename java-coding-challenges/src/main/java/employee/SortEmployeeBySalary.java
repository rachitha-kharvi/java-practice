package employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {
    public static void main(String[] args){
        System.out.println("**********Comparable Interface*************");
        System.out.println("Before sorting");
        List<Employee> employees = new java.util.ArrayList<>(EmployeeData.getEmployee());
        employees.forEach(System.out::println);
        System.out.println("After sorting");
        Collections.sort(employees);
        employees.forEach(System.out::println);
        System.out.println("**********Comparator Interface*************");
        Comparator<Employee> byName=Comparator.comparing(Employee::getSalary);
        employees.sort(byName);
        System.out.println("After sorting name");
        employees.forEach(System.out::println);
    }
}
