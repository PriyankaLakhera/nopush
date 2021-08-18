/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

/**
 *
 * @author pc
 */
public class Stock{ 
        
     // data fields
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    //no arg constructor
     Stock(){
         
    }
    //four args constructor
    
    Stock(String symbol, String name, double previousClosingPrice , double currentPrice){
        this.symbol = symbol;
        this.name =name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }   
    
   
    public double priceChangePrct(){
    return ((previousClosingPrice - currentPrice) / previousClosingPrice ) *100 ;
    }
}
