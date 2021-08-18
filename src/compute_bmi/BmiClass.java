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
public class BmiClass {
    
    //data fields
    double height;
    double weight;
    double bmi;
      
    //no args constructor
    public BmiClass(){
        
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    
    public void calculateBmi (){
        bmi = (this.weight * 0.45359237)/((Math.pow((this.height * 0.0254),2))); 
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
