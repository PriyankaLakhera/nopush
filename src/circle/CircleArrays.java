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
public class CircleArrays {
    public static void main(String []args){
        
        CircleArrayObjects[] circle = new CircleArrayObjects[5];
        
        for(int i=0; i<5 ; i++){
            circle[i].setRadius((int)Math.random() * 10);
            circle[i].setArea(circle[i].radius());
        }
        
    }
    
}
