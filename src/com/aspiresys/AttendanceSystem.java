package com.aspiresys;

import java.util.Scanner;

public class AttendanceSystem {
    private static Attendance attendanceSystem;
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("\nStudent Attendance Management System");
        System.out.println("1. Add Student");
        System.out.println("2. Mark Attendance");
        System.out.println("3. View Attendance (Individual)");
        System.out.println("4. View All Attendance");
        System.out.println("5. Exit");
        System.out.print("Please select an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                markAttendance();
                break;
            case 3:
                viewIndividualAttendance();
                break;
            case 4:
                attendanceSystem.viewAllAttendance();
                break;
            case 5:
                System.out.println("Exiting the system...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }

    public static void addStudent() {
        System.out.print("Enter Student Name: ");
        scanner.nextLine(); // Consume the newline left by nextInt()
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        attendanceSystem.addStudent(name, rollNumber);
        System.out.println("Student added successfully.");
    }

    public static void markAttendance() {
        System.out.print("Enter Roll Number to mark attendance: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Is the student present? (true/false): ");
        boolean isPresent = scanner.nextBoolean();

        attendanceSystem.markAttendance(rollNumber, isPresent);
    }

    public static void viewIndividualAttendance() {
        System.out.print("Enter Roll Number to view attendance: ");
        int rollNumber = scanner.nextInt();

        attendanceSystem.viewAttendance(rollNumber);
    }
    

    public static void main(String[] args) {
        
        attendanceSystem = new Attendance();

        while (true) {
            showMenu();
        }
    }
}

