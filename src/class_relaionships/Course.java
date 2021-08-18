/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_relaionships;

/**
 *
 * @author pc
 */
public class Course {
    String name;
    String [] students = new String [20];    
    int nbrOfStudents = 0;
    
    //constructors
Course(){
    
}

Course (String name){
    this.name = name;
}

//methods

void addStudent (String studentName){
    students[nbrOfStudents] = studentName;
}

    
    
}
