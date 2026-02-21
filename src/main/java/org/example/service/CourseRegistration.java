package org.example.service;

import java.util.ArrayList;
import org.example.model.Course;

public class CourseRegistration {
    ArrayList<Course>courseList = new ArrayList();

    //CREATE
    public void saveCourse(Course course){
        courseList.add(course);
    }

    //READ
    public void displayAllCourse(){
        System.out.println(courseList);
    }

    //UPDATE
    public void updateCourse(Course course){
        for(int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID() == (course.getCourseID())){
                courseList.set(i, course);
                break;
            }
        }
    }

    //DELETE
    public String deleteCourse(Course course){
        for(int i = 0; i < courseList.size(); i++){
            if(courseList.get(i).getCourseID() == (course.getCourseID())){
                courseList.remove(i);
                return "Deleted Successfully";
            }
        }return "Error";
    }

}
