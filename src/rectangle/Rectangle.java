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
public class Rectangle {
    
    //data fields
    double width = 1; //default width is 1
    double height = 1; //default height is 1

    // no arg constructor
    Rectangle(){
    }
    //two args constructor
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
   double getArea(){
    return width * height;
    }
   double getPerimeter(){
   return 2 * (width + height);
   }
}
   

