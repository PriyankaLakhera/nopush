/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM_machine;

import java.util.Scanner;
/**
 *
 * @author pc
 */
public class atmMain {
    public static void main (String [] args){
        
        atm [] account = new atm[10]; //array of 10 accounts
        
        for (int i =0;  i<10; i++){
            account[i] = new atm(i);
        }
        
        System.out.println("Enter account ID");
        Scanner input = new Scanner(System.in);
        int enteredId = input.nextInt();
        
        while(enteredId != account[enteredId].getId()){
            System.out.println("Enter valid id");  
            enteredId = input.nextInt();
        } //end of while loop
        
        if(enteredId == account[enteredId].getId()){
            System.out.println("Main menu\n" +
                    "1: check balance\n" +
                    "2: withdraw\n" +
                    "3: deposit\n" +
                    "4: exit\n" + "Enter a choice:");
            
            int choice = input.nextInt();
            
            while(choice ==1){
                System.out.println("Balance is " + account[enteredId].checkBalance());
                System.out.println("Enter account ID");
                enteredId = input.nextInt();
            }
            while(choice ==2){
                System.out.println("Enter balance to withdraw");
                account[enteredId].withdraw(input.nextDouble());
                 System.out.println("Enter account ID");
                enteredId = input.nextInt();
            }
            while(choice ==3){
                System.out.println("Enter amount to deposit");
                account[enteredId].deposit(input.nextDouble());
                 System.out.println("Enter account ID");
                enteredId = input.nextInt();
            }
            while(choice ==4){
                 System.out.println("Enter account ID");
                enteredId = input.nextInt();
            }
            
        }//end of while loop
        
    }
}