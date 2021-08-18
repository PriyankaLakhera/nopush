/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_relaionships;

/**
 *
 * @author priyanka
 */
public class Student {
    
    private String name;
    private int ID;
    String[] courses = new String[20];
    private int nbrOfCourses = 0;
    
    //constructors
    Student(){
    
    }
    
    Student(String name, int ID ){
        this.name = name;
        this.ID = ID;    
    }
    
    String getName(){
        return name;
    }
    
    void setName(String name){
        this.name = name;        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    void addCourse(String course){
        courses [nbrOfCourses] = course;
        nbrOfCourses++ ;
    }
      
    
    }
    
    
    

