/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superKW;

/**
 *
 * @author pc
 */
public class Faculty extends Emloyee {
    public  Faculty (){
        System.out.println(" Faculty constructor is invoked");
    }
    
}
class Emloyee extends person{
    
    public Emloyee(){
        System.out.println("Emloyee constructor is invoked");
    }
}

class person{
    public person(){
        System.out.println("Person constructor is invoked");
    }
}
