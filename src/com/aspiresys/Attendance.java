package com.aspiresys;

import java.util.ArrayList;
import java.util.List;

public class Attendance implements AttendanceManagement {
    private List<Student> students = new ArrayList<>();
    private List<Boolean> attendanceRecords = new ArrayList<>(); // List to store attendance (True/False)


    // Add a student to the system
    @Override
    public void addStudent(String name, int rollNumber) {
        Student student = new Student(name, rollNumber);
        students.add(student);
        attendanceRecords.add(false); // Initialize attendance as 'false' (Absent) for new students
    }

    // Mark attendance for a student by roll number
    @Override
    public void markAttendance(int rollNumber, boolean isPresent) {
        // Check if rollNumber is valid (matching any student's roll number)
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                attendanceRecords.set(i, isPresent); // Mark the student's attendance
                System.out.println("Attendance for Roll Number " + rollNumber + " marked as " + (isPresent ? "Present" : "Absent"));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Invalid Roll Number!");
        }
    }

    // View attendance for a specific student
    @Override
    public void viewAttendance(int rollNumber) {
        // Check if rollNumber is valid (matching any student's roll number)
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                Student student = students.get(i);
                boolean isPresent = attendanceRecords.get(i);
                System.out.println(student.getName() + " (Roll Number: " + rollNumber + ") is " + (isPresent ? "Present" : "Absent"));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid Roll Number!");
        }
    }

    // View attendance for all students
    @Override
    public void viewAllAttendance() {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            boolean isPresent = attendanceRecords.get(i);
            System.out.println(student.getName() + " (Roll Number: " + student.getRollNumber() + ") is " + (isPresent ? "Present" : "Absent"));
        }
    }
}
