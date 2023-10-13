package com.example.java_week_5;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private final String name;
    private final String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return name + " (" + studentNumber + ")";
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.print("name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("student number: ");
            String studentNumber = scanner.nextLine();
            students.add(new Student(name, studentNumber));
        }

        System.out.println("\nStudent Information:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.print("\nGive search term: ");
        String searchTerm = scanner.nextLine();

        System.out.println("Result:");
        for (Student student : students) {
            if (student.getName().contains(searchTerm) || student.getStudentNumber().contains(searchTerm)) {
                System.out.println(student);
            }
        }

        scanner.close();
    }
}
