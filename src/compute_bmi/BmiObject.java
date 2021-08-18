/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute_bmi;
import java.util.Scanner;
/**
 *
 * @author priyanka
 */
public class BmiObject {
    public static void main (String[] args){
        
        BmiClass bmi = new BmiClass();  //object
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds and height in inches" ); //prompt user to enter weight and height       
       bmi.setWeight(sc.nextDouble());
        bmi.setHeight(sc.nextDouble());
        
        bmi.calculateBmi();
    }
    
}
