/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobjects;

/**
 *
 * @author pc
 */
public class geometricObjects {
    
    private String color = " white" ;
    private boolean filled;
    private java.util.Date dateCreated;
    
    geometricObjects(){
        
        dateCreated = new java.util.Date();
    
    }
    
    geometricObjects(String color , boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;    
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        return "Color: " + color + "Filled: " + filled ;
        
        
    }
    
}
