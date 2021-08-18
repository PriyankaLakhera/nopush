/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute_bmi;

/**
 *
 * @author priyanka
 */

import java.util.Scanner;
public class BMI {
    public static void main (String[]args){
        
        //declare needed variables
        double height;
        double weight;
        double bmi;
        
        //prompt user to enter weight
        System.out.println("Enter your weight in pounds");
        
        
        //create scanner object
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        
        //prompt user to enter height
        System.out.println("Enter your height in inches");
        height = sc.nextDouble();
        
        //Calculate bmi
        bmi = (weight * 0.4535923)/(Math.pow((height* 0.0254),2));           
                        
           if(bmi<18.5){
           System.out.println("Your bmi is " + bmi + " \n underweight");
       }
       else if(bmi <25.0){
           System.out.println("Your bmi is " + bmi + " \n Normal");
       }
       else if(bmi<30.0){
           System.out.println("Your bmi is " + bmi + " \n Overweight");
       }
       else{
           System.out.println("Your bmi is " + bmi + " \n Obese");
       }
    }
    
}
