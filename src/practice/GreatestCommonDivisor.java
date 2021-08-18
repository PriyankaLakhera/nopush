/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
    
    public static void main(String[] args){
    
        System.out.println("Please enter two integers to find their greatest common divisor"); //prompt user to enter two integers
        
        Scanner sc = new Scanner(System.in); //scanner object
        int integer1 = sc.nextInt(); // input integer
        int integer2 = sc.nextInt(); //input integer
        
        int gcd=1;
        int k = 1;
        
       do{
       ++k;           
       
       if(integer1 % k ==0 && integer2 %k ==0){
           gcd=k;
       }
         }       while(integer1 >=k && integer2 >=k);
        System.out.println("greatest common divisor of " + integer1 +"and" + integer2 + "is" + gcd);
       
     
        
    }
    
}
