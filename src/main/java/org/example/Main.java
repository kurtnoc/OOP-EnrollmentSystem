package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentID("2024374391");
        student.setStudentName("John Doe");
        student.setProgram("Information Technology");
        student.display();


        Course course = new Course();
        course.setCourseID("0001");
        course.setCourseName("Infoman");
        course.setProgram("Information Technology");
        course.display();


        }
    }
