/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM_machine;

/**
 *
 * @author pc
 */
public class atm {  
  
    int id ;
    double balance = 100;
    
    //no args constructor
    atm(){
    
    }
    
    atm(int id){
        this.id = id;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    double checkBalance (){
        return balance;
    }
    
    void withdraw (double withdraw){
        this.balance = balance - withdraw;
    }
    void deposit (double deposit){
        this.balance = balance + deposit;
    }
    
}
