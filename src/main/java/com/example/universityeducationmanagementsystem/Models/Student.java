package com.example.universityeducationmanagementsystem.Models;

public class Student extends Person{
    private int studentNumber;

    public Student(String firstName, String lastName, String codeMli, int studentNumber) {
        super(firstName, lastName, codeMli);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
