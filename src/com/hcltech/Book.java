package com.hcltech;

import java.util.*;

public class Book {
    private String title;

    public Book(String title) { this.title = title; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return title;
    }

    // Dummy data
    public static List<Book> getDummyBooks() {
        return Arrays.asList(
                new Book("Java Basics"),
                new Book("Spring Boot Guide"),
                new Book("Microservices in Action"),
                new Book("Design Patterns in Java")
        );
    }
}

