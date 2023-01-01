package com.example.universityeducationmanagementsystem.Models;

public class Person {
    private String firstName;
    private String lastName;
    private String codeMli;

    public Person(String firstName, String lastName, String codeMli) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.codeMli = codeMli;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCodeMli() {
        return codeMli;
    }

    public void setCodeMli(String codeMli) {
        this.codeMli = codeMli;
    }
}
