package com.aspiresys;

public interface AttendanceManagement {
    void addStudent(String name, int rollNumber); // To add student
    void markAttendance(int rollNumber, boolean isPresent); // To mark attendance
    void viewAttendance(int rollNumber); // To view individual student attendance
    void viewAllAttendance(); // To view all students' attendance
}

