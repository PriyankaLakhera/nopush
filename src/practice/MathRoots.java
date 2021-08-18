/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner; 
public class MathRoots {
    public static void main (String [] args){
    
        System.out.println("Enter values of a, b, c to calculate the discriminant ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double discriminant = Math.pow(b, 2) - (4*a*c);
        
        if(discriminant <0){        
            
            System.out.println( " Discriminant is negative, therefore no real roots");
        }
        if(discriminant >0){
        
            double r1 = (-b + Math.pow(discriminant,0.5) ) / (2*a);
            double r2 = (-b - Math.pow(discriminant,0.5) ) / (2*a);
            
            System.out.println("Discriminant is positive, therefore two roots are possible: \n " + r1 + "and" + r2);
        }
        if(discriminant ==0){
            
            double root = -b / (2*a);
            
            System.out.println("Discriminant is equal to 0, only one root is possible " + root);
           
        }
        
    
    
    }
    
    
}
