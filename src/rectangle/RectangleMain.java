/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author pc
 */
public class RectangleMain {
    public static void main(String[]args){
        
    Rectangle rectangle1 = new Rectangle(4,40);  //Recangle object
    Rectangle rectangle2 = new Rectangle(3.5,3.59); //Rectangle object
    
    //Print the output    
    System.out.println("Rectangle 1: Width- " + rectangle1.width + " Height- " + rectangle1.height + " Area- "+
            rectangle1.getArea() + " Perimeter- " + rectangle1.getPerimeter ());
    System.out.println("Rectangle 2: Width- " + rectangle2.width + " Height- " + rectangle2.height + " Area- "+ 
            rectangle2.getArea() + " Perimeter- " + rectangle2.getPerimeter ());
    
    }
    
}
