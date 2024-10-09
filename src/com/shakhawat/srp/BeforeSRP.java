package com.shakhawat.srp;

/**
 * Single Responsibility Principle
 * <p>
 * A class should have one and only one reason to change
 */

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        System.out.println("Saving user to database.");
    }
}

public class BeforeSRP {

    public static void main(String[] args) {
        User user = new User("John Doe", "j5sQD@example.com");
        user.saveToDatabase();
    }

}
