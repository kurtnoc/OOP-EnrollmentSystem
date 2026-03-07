package org.example.model;

public class Student extends Person {
    private String program;


    public Student(int ID, String name, String program){
        super(ID, name);
        this.program = program;

    }

//    public int getStudentID(){
//        return studentID;
//    }
//
//    public void setStudentID(int studentID){
//        this.studentID = studentID;
//    }
//
//    public String getStudentName(){
//        return studentName;
//    }
//
//    public void setStudentName(String studentName){
//        this.studentName = studentName;
//    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void display(){
        System.out.printf("Student ID: %s \n", getID());
        System.out.printf("Student Name: %s \n", getName());
        System.out.printf("Student Program: %s \n\n", getProgram());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + getID() + '\'' +
                ", studentName='" + getName() + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
