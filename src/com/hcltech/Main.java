package com.hcltech;
import java.util.*;
import java.util.stream.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Employees
        List<Employee> employees = Employee.getDummyEmployees();
        List<String> names = employees.stream()
                .filter(emp -> emp.getAge() > 30 && "Engineering".equals(emp.getDepartment()))
                .map(Employee::getName)
                .toList();
        System.out.println("Employees >30 in Engineering: " + names);

        // Transactions
        Map<String, Long> transactionCount = Transaction.getDummyTransactions().stream()
                .collect(Collectors.groupingBy(Transaction::getType, Collectors.counting()));
        System.out.println("Transaction count by type: " + transactionCount);

        // Products
        List<Product> top3 = Product.getDummyProducts().stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(3)
                .toList();
        System.out.println("Top 3 expensive products: " + top3);

        // Orders & Items
        List<String> itemNames = Order.getDummyOrders().stream()
                .flatMap(order -> order.getItems().stream())
                .map(Item::getName)
                .toList();
        System.out.println("All item names: " + itemNames);

        // Books
        String allTitles = Book.getDummyBooks().stream()
                .map(Book::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("Book titles: " + allTitles);

        // Numbers (parallel stream)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = numbers.parallelStream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumOfSquares);

        // Users
        Optional<User> user = User.getDummyUsers().stream()
                .filter(u -> u.getEmail().endsWith("@example.com"))
                .findFirst();
        System.out.println("First user with @example.com: " +
                user.map(User::getEmail).orElse("Not found"));
    }
}


