/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobjects;

/**
 *
 * @author pc
 */
public class Circle  extends geometricObjects {
    
    private double radius;
    
    Circle(){
        
    }
    
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius , String color , boolean filled ){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    double getRadius(){
        return radius;
    }
   void  setRadius(double radius){
       this.radius = radius;
   }
   double getArea(){
       return radius * radius * Math.PI ;
   }
    double getPerimeter(){
        return (2 * Math.PI * radius) ;
    }
    double getDiameter(){
        return 2 * radius;
    }
    void printCircle(){
        System.out.println("Radius: " + radius + "\n Color: " + getColor() + "\n Filled: "
        + isFilled() + "\n Area: " + getArea() + "\n Perimeter: " + getPerimeter() + 
                "\n Diameter: " + getDiameter());
                }
    
    
}
