package com.aspiresys;

public abstract class AbstractStudent {
    private String name;
    private int rollNumber;

    // Constructor
    public AbstractStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayStudentInfo();
}

