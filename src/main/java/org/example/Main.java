package org.example;
import java.util.*;


import org.example.model.Course;
import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Student student = new Student();
//        student.setStudentID("2024374391");
//        student.setStudentName("John Doe");
//        student.setProgram("Information Technology");
//        student.display();
//
//
//        Course course = new Course();
//        course.setCourseID("0001");
//        course.setCourseName("Infoman");
//        course.setProgram("Information Technology");
//        course.display();


        //**STUDENT REGISTRATION**

        StudentRegistration studentRegistration = new StudentRegistration();

        //SAVE STUDENT
        studentRegistration.saveStudent(new Student(1, "John", "Infoman"));
        studentRegistration.saveStudent(new Student(2, "Joenel Mendoze", "BSIT"));
        studentRegistration.saveStudent(new Student(3, "John Ferrari", "BSIT"));

        //READ
        studentRegistration.displayAllStudent();

        //UPDATE
        studentRegistration.updateStudent(new Student(1,"John Jay", "BSIT"));


        //DElETE
        studentRegistration.delete(new Student(1, "John Jay", "BSIT"));


        //**COURSE REGISTRATION**
        CourseRegistration courseRegistration = new CourseRegistration();

        //CREATE
        courseRegistration.saveCourse(new Course(1,"Inteprog", "BSIT"));

        //READ
        courseRegistration.displayAllCourse();

        //UPDATE
        courseRegistration.updateCourse(new Course(1, "Infoman", "BSIT"));

        //DELETE
        courseRegistration.deleteCourse(new Course(1, "Infoman", "BSIT"));





        }
    }
