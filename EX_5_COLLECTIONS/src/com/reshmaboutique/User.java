package com.reshmaboutique;

public class User {
    private String name;
    private String password;
    private String user_type;
    
    // Default constructor (if needed)
    public User() {
    }

    // Parameterized constructor
    public User(String name, String password, String user_type) {
        this.name = name;
        this.password = password;
        this.user_type = user_type;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", password=" + password + ", user_type=" + user_type + "]";
    }
}
