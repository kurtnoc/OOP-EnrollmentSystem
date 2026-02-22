package org.example.service;
import java.util.*;
import org.example.model.Student;


public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList();
    Scanner scan = new Scanner(System.in);

    //CREATE
    public void saveStudent(Student student){

        studentList.add(student);
    }

    //READ
    public void displayAllStudent(){
        System.out.println(studentList);
    }

    //UPDATE
    public void updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.set(i, student);
                break;

            }
        }
    }

    //REMOVE
    public String delete(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentID() == (student.getStudentID())){
                studentList.remove(i);
                return "Deleted Successfully";

            }
        }return "Error";
    }

}
