/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author pc
 */
public class Circle {
    
    // data fields
    double radius = 1 ;
    double area;
    double perimeter;
    
    //constructor
    public Circle(){
    
    }
    //constructor
    public Circle(double newRadius){
            radius = newRadius;
    }
    
     double getArea(){
                return radius * radius * Math.PI;
    }
     
     double getPerimeter(){        
         return 2 * Math.PI * radius;
     }
    
}
