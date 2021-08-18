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
public class Main {
        public static void main (String[]args){
            
            Student student = new Student("Akash", 99106);
            student.addCourse("Java");
            System.out.println("Name: " + student.getName() + "\n ID: " + student.getID());
            
        
        }
    
}
