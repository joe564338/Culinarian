package com.packages.joe.culinarian;

/**
 * Created by Joe on 1/18/2016.
 */
public class User {
    private String userName;
    private String password;
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
