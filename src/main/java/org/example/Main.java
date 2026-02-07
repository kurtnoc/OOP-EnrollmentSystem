package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentID("2024374391");
        student.setStudentName("John Doe");
        student.setProgram("Information Technology");

        System.out.println("StudentID: " + student.getStudentID());
        System.out.println("StudenName: " + student.getStudentName());
        System.out.println("Student Program: " + student.getProgram());


        Course course = new Course();
        course.setCourseID("0001");
        course.setCourseName("Infoman");
        course.setProgram("Information Technology");

        System.out.println("\nCourseID: " + course.getCourseID());
        System.out.println("CourseName: " + course.getCourseName());
        System.out.println("Program: " + course.getProgram());

        }
    }
