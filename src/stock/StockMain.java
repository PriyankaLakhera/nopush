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
public class StockMain {
    public static void main(String[] args) {
    
        Stock stock = new Stock("ORCL"," Oracle Corporation", 34.5, 34.35);
        
        System.out.println(stock.priceChangePrct() + "%");
    }
    
}
