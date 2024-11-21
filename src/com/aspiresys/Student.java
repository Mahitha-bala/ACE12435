package com.aspiresys;

public class Student extends AbstractStudent {

    public Student(String name, int rollNumber) {
        super(name, rollNumber);
    }

    @Override
    public void displayStudentInfo() {
        System.out.println("Student Roll Number: " + getRollNumber() + ", Name: " + getName());
    }
}

