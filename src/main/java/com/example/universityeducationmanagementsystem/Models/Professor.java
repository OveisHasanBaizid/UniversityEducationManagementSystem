package com.example.universityeducationmanagementsystem.Models;

public class Professor extends Person{
    private int professorCode;

    public Professor(String firstName, String lastName, String codeMli, int professorCode) {
        super(firstName, lastName, codeMli);
        this.professorCode = professorCode;
    }

    public int getProfessorCode() {
        return professorCode;
    }

    public void setProfessorCode(int professorCode) {
        this.professorCode = professorCode;
    }
}
