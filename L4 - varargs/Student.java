import java.util.Scanner;
import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private String[] courses;
    private double gpa;

    // Constructor for the Student
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new String[5]; // Maximum of 5 courses
    }

    // Method to add a course
    public void addCourse(String course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                return;
            }
        }
        System.out.println("Cannot add more than 5 courses.");
    }

    // Method to set GPA
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Getter for courses
    public String[] getCourses() {
        return courses;
    }

    // Getter for GPA
    public double getGPA() {
        return gpa;
    }

    // Override toString method for custom string representation
    @Override
    public String toString() {
        StringBuilder coursesStr = new StringBuilder();
        for (String course : courses) {
            if (course != null) {
                coursesStr.append(course).append(", ");
            }
        }
        if (coursesStr.length() > 0) {
            coursesStr.setLength(coursesStr.length() - 2); // Remove trailing comma and space
        }

        return "Student Name: " + firstName + " " + lastName + "\n" +
                "Courses: " + coursesStr.toString() + "\n" +
                "GPA: " + gpa;
    }

    // Method to create a student object interactively
    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter student's last name:");
        String lastName = scanner.nextLine();

        Student student = new Student(firstName, lastName);

        System.out.println("Enter the number of courses (up to 5):");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (numCourses > 5) {
            System.out.println("Number of courses cannot exceed 5. Setting to maximum (5).");
            numCourses = 5;
        }

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter course #" + (i + 1) + ":");
            String course = scanner.nextLine();
            student.addCourse(course);
        }

        System.out.println("Enter student's GPA:");
        double gpa = scanner.nextDouble();
        student.setGPA(gpa);

        return student;
    }
}
