package com.mycompany.tla005;

import java.util.Scanner;
import java.util.LinkedList;

public class TLA005 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> names = new LinkedList<>();
        LinkedList<String> course = new LinkedList<>();

        while (true) {
            System.out.println("Choices: ");
            System.out.println("1. Add Name");
            System.out.println("2. Add Course");
            System.out.println("3. Delete");
            System.out.println("4. Display all stored names and courses ");

            System.out.println("6. Exit");
            String choice = scan.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter a name to add: ");
                    names.add(scan.nextLine().trim());
                    System.out.println("Name added successfully!");
                    break;
                case "2":
                    System.out.println("Enter a course to add");
                    names.add(scan.nextLine().trim());
                    System.out.println("Course added successfully!");
                    break;
                case "3":
                    System.out.println("Enter 'name' to delete a name or 'course' to delete a course:");
                    String type = scan.nextLine().trim().toLowerCase();

                    if (type.equals("name")) {
                        if (names.isEmpty()) {
                            System.out.println("No names stored yet!");
                        } else {
                            System.out.print("Enter name to delete: ");
                            String nameToDelete = scan.nextLine().trim();
                            if (names.remove(nameToDelete)) {
                                System.out.println(nameToDelete + " has been deleted.");
                            } else {
                                System.out.println(nameToDelete + " not found.");
                            }
                        }
                    } else if (type.equals("course")) {
                        if (course.isEmpty()) {
                            System.out.println("No courses stored yet!");
                        } else {
                            System.out.print("Enter course to delete: ");
                            String courseToDelete = scan.nextLine().trim();
                            if (course.remove(courseToDelete)) {
                                System.out.println(courseToDelete + " has been deleted.");
                            } else {
                                System.out.println(courseToDelete + " not found.");
                            }
                        }
                    } else {
                        System.out.println("Invalid type. Please enter 'name' or 'course'.");
                    }
                    break;

                case "4":
                    System.out.println("\nStored Names:");
                    if (names.isEmpty()) {
                        System.out.println("No names stored.");
                    } else {
                        for (String name : names) {
                            System.out.println("- " + name);
                        }
                    }
                    break;

                case "5":
                    System.out.println("\nStored Courses:");
                    if (course.isEmpty()) {
                        System.out.println("No courses stored.");
                    } else {
                        for (String courses : course) {
                            System.out.println("- " + course);
                        }
                    }
                    break;

                case "6":
                    System.out.println("Program terminated.");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 6.");
                    break;
            }
        }
    }
}
