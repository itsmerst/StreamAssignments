package com.hcltech;
import java.util.*;

public class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " (" + age + ", " + department + ")";
    }

    // Dummy data
    public static List<Employee> getDummyEmployees() {
        return Arrays.asList(
                new Employee("Alice", 35, "Engineering"),
                new Employee("Bob", 28, "HR"),
                new Employee("Charlie", 40, "Engineering"),
                new Employee("David", 32, "Finance")
        );
    }
}
