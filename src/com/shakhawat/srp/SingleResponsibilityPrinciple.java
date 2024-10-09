package com.shakhawat.srp;

/**
 * Single Responsibility Principle
 * <p>
 * A class should have one and only one reason to change
 */

class SystemUser {
    private String name;
    private String email;

    public SystemUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}

class UserRepository {
    public void saveToDatabase(SystemUser user) {
        // Code to save user to the database
        System.out.printf("Saving user %s to database%n", user);
    }
}

public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {
        SystemUser user = new SystemUser("John Doe", "mollah@example.com");
        UserRepository userRepository = new UserRepository();
        userRepository.saveToDatabase(user);
    }
}
