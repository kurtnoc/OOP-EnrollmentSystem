package org.example;
import java.util.*;

import org.example.model.Person;
import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Instructor;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;
import org.example.service.InstructorRegistration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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
        CourseRegistration courseRegistration = new CourseRegistration();
        InstructorRegistration instructorRegistration = new InstructorRegistration();

        boolean running = true;

        while(running){

        //Welcome Page
        System.out.println("======================================");
        System.out.println("===WELCOME TO THE ENROLLMENT SYSTEM===");
        System.out.println("======================================");

        System.out.println("Access Student or Course Registration?");
        System.out.println("");
        System.out.println("[0] Exit \n[1] Student \n[2] Course \n[3] Instructor");
        System.out.print("Choice: ");
        int menuChoice = scan.nextInt();

        switch (menuChoice) {

            case 1: //Student Registration Menu
                boolean studentMenu = true;

                while(studentMenu) {
                    System.out.println("\n===STUDENT MENU===");
                    System.out.println("[0] Go Back");
                    System.out.println("[1] Add Student");
                    System.out.println("[2] Display All Students");
                    System.out.println("[3] Update Student");
                    System.out.println("[4] Delete Student");
                    System.out.print("Choice: ");
                    int studentChoice = scan.nextInt();

                    switch(studentChoice){

                        case 1: //SAVE STUDENT
                            System.out.print("Enter Student ID:");
                            int student_ID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter Student Name: ");
                            String student_Name = scan.nextLine();

                            System.out.print("Enter Program: ");
                            String student_Program = scan.nextLine();

//                            Person person = new Person(student_ID, student_Name);

                            studentRegistration.saveStudent(new Student(student_ID, student_Name, student_Program));
                            System.out.println("Student saved successfully!");
                            break;

                        case 2: //DISPLAY STUDENTS
                            studentRegistration.displayAllStudent();
                            break;

                        case 3: //UPDATE STUDENTS
                            System.out.print("Enter Student ID to update: ");
                            int update_studentID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter New Name: ");
                            String update_studentName = scan.nextLine();

                            System.out.print("Enter New Program");
                            String update_studentProgram = scan.nextLine();

                            studentRegistration.updateStudent(new Student(update_studentID, update_studentName, update_studentProgram));

                            System.out.println("Student updated successfully!");
                            break;

                        case 4: //DELETE STUDENTS
                            System.out.print("Enter Student ID to delete: ");
                            int delete_studentID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter Student Name: ");
                            String delete_studentName = scan.nextLine();

                            System.out.print("Enter Student Program: ");
                            String delete_studentProgram = scan.nextLine();

                            studentRegistration.delete(new Student(delete_studentID, delete_studentName, delete_studentProgram));
                            System.out.println("Student deleted successfully!");
                            break;

                        case 0: //BACK
                            studentMenu = false;
                            break;

                        default:
                            System.out.println("Invalid Choice. Try again.");

                    }
                }
                break;

            case 2: //COURSE MENU
                boolean courseMenu = true;
                while(courseMenu){
                    System.out.println("\n===COURSE MENU===");
                    System.out.println("[0] Go Back");
                    System.out.println("[1] Add Course");
                    System.out.println("[2] Display All Courses");
                    System.out.println("[3] Update Course");
                    System.out.println("[4] Delete Course");

                    System.out.print("Choice: ");
                    int courseChoice = scan.nextInt();

                    switch(courseChoice){

                        case 1:
                            System.out.print("Enter Course ID:");
                            int course_ID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter Course Name: ");
                            String course_Name = scan.nextLine();

                            System.out.print("Enter Course Program: ");
                            String course_Program = scan.nextLine();

                            courseRegistration.saveCourse(new Course(course_ID, course_Name, course_Program));
                            System.out.println("course saved successfully!");
                            break;

                        case 2: //DISPLAY COURSE
                            courseRegistration.displayAllCourse();
                            break;

                        case 3: //UPDATE COURSE
                            System.out.print("Enter Course ID to update:");
                            int updated_courseID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter Course Name: ");
                            String updated_courseName = scan.nextLine();

                            System.out.print("Enter Course Program: ");
                            String updated_courseProgram = scan.nextLine();

                            courseRegistration.updateCourse(new Course(updated_courseID, updated_courseName, updated_courseProgram));
                            System.out.println("course updated successfully!");
                            break;

                        case 4:
                            System.out.print("Enter Course ID to delete:");
                            int delete_courseID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter Course Name: ");
                            String delete_courseName = scan.nextLine();

                            System.out.print("Enter Course Program: ");
                            String delete_courseProgram = scan.nextLine();

                            courseRegistration.deleteCourse(new Course(delete_courseID, delete_courseName, delete_courseProgram));
                            System.out.println("course deleted successfully!");
                            break;

                        case 0:
                            courseMenu = false;
                            break;

                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                }
                break;

            case 3: //Student Registration Menu
                boolean instructorMenu = true;

                while(instructorMenu) {
                    System.out.println("\n===INSTRUCTOR MENU===");
                    System.out.println("[0] Go Back");
                    System.out.println("[1] Add Instructor");
                    System.out.println("[2] Display All Instructors");
                    System.out.println("[3] Update Instructor");
                    System.out.println("[4] Delete Instructor");
                    System.out.print("Choice: ");
                    int instructorChoice = scan.nextInt();

                    switch(instructorChoice){

                        case 1: //SAVE STUDENT
                            System.out.print("Enter Instructor ID:");
                            int instructor_ID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter Instructor Name: ");
                            String instructor_Name = scan.nextLine();

                            System.out.print("Enter Course: ");
                            String instructor_Course = scan.nextLine();

//                            Person person = new Person(student_ID, student_Name);

                            instructorRegistration.saveInstructor(new Instructor(instructor_ID, instructor_Name, instructor_Course));
                            System.out.println("Instructor saved successfully!");
                            break;

                        case 2: //DISPLAY STUDENTS
                            instructorRegistration.displayAllInstructor();
                            break;

                        case 3: //UPDATE STUDENTS
                            System.out.print("Enter Instructor ID to update: ");
                            int update_instructorID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter New Name: ");
                            String update_instructorName = scan.nextLine();

                            System.out.print("Enter New Course");
                            String update_instructorCourse = scan.nextLine();

                            instructorRegistration.updateInstructor(new Instructor(update_instructorID, update_instructorName, update_instructorCourse));

                            System.out.println("Instructor updated successfully!");
                            break;

                        case 4: //DELETE STUDENTS
                            System.out.print("Enter Instructor ID to delete: ");
                            int delete_instructorID = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Enter Instructor Name: ");
                            String delete_instructorName = scan.nextLine();

                            System.out.print("Enter Instructor Course: ");
                            String delete_instructorCourse = scan.nextLine();

                            instructorRegistration.deleteInstructor(new Instructor(delete_instructorID, delete_instructorName, delete_instructorCourse));
                            System.out.println("Instructor deleted successfully!");
                            break;

                        case 0: //BACK
                            instructorMenu = false;
                            break;

                        default:
                            System.out.println("Invalid Choice. Try again.");

                    }
                }
                break;

            case 4:
                studentRegistration.displayAllStudent();
                courseRegistration.displayAllCourse();
                instructorRegistration.displayAllInstructor();
                break;

            case 0:
                System.out.println("Exiting...");
                running = false;
                break;

            default:
                System.out.println("Invalid. Try again.");

            }

        }

//        //SAVE STUDENT
//        studentRegistration.saveStudent(new Student(1, "John", "Infoman"));
//        studentRegistration.saveStudent(new Student(2, "Joenel Mendoze", "BSIT"));
//        studentRegistration.saveStudent(new Student(3, "John Ferrari", "BSIT"));

//        //READ
//        studentRegistration.displayAllStudent();

//        //UPDATE
//        studentRegistration.updateStudent(new Student(1,"John Jay", "BSIT"));


//        //DElETE
//        studentRegistration.delete(new Student(1, "John Jay", "BSIT"));


        //**COURSE REGISTRATION**
//        CourseRegistration courseRegistration = new CourseRegistration();

        //CREATE
//        courseRegistration.saveCourse(new Course(1,"Inteprog", "BSIT"));
//
//        //READ
//        courseRegistration.displayAllCourse();
//
//        //UPDATE
//        courseRegistration.updateCourse(new Course(1, "Infoman", "BSIT"));
//
//        //DELETE
//        courseRegistration.deleteCourse(new Course(1, "Infoman", "BSIT"));

        Instructor instructor = new Instructor();
        System.out.print("Instructor's Main Task: ");
        instructor.mainTask();

        Student student = new Student();
        System.out.print("Student's Main Task: ");
        student.mainTask();








        }
    }
