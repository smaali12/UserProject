package com.example.UserProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int userId ;
    private String  email;
    private  String passWord;
    private String firstname;
    private String lastName;


    public User() {
    }

    public User(int userId, String email, String passWord, String firstname, String lastName) {
        this.userId = userId;
        this.email = email;
        this.passWord = passWord;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public int getUserId() {
        return userId;
    }

      public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
