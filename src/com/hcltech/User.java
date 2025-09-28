package com.hcltech;

import java.util.*;

public class User {
    private String email;

    public User(String email) { this.email = email; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return email;
    }

    // Dummy data
    public static List<User> getDummyUsers() {
        return Arrays.asList(
                new User("john@gmail.com"),
                new User("alex@example.com"),
                new User("mark@example.com"),
                new User("lisa@yahoo.com")
        );
    }
}
