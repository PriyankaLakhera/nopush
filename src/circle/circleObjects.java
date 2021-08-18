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
public class circleObjects {
    public static void main(String[]args){
    
        Circle circle1 = new Circle(); //object
        Circle circle2 = new Circle(1);//object
        
        System.out.println("Area of circle2 is " + circle2.getArea());
        
          System.out.println("Area of circle1 is " + circle1.getArea());      
        
    }
       
    
}
