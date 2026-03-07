package org.example.service;

import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.Scanner;

public class InstructorRegistration {
    private ArrayList<Instructor> instructorList = new ArrayList();
    Scanner scan = new Scanner(System.in);

    //CREATE
    public void saveInstructor(Instructor instructor){

        instructorList.add(instructor);
    }

    //READ
    public void displayAllInstructor(){
        System.out.println(instructorList);
    }

    //UPDATE
    public void updateInstructor(Instructor instructor) {
        for (int i = 0; i < instructorList.size(); i++){
            if(instructorList.get(i).getID() == (instructor.getID())){
                instructorList.set(i, instructor);
                break;

            }
        }
    }

    //REMOVE
    public String deleteInstructor(Instructor instructor){
        for(int i = 0; i < instructorList.size(); i++){
            if(instructorList.get(i).getID() == (instructor.getID())){
                instructorList.remove(i);
                return "Deleted Successfully";

            }
        }return "Error";
    }
}
