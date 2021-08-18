/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author pc
 */
public class TV {
    
    //data fields
    int channel = 1;
    int volume = 1;
    boolean on;
    
    //constructors
    public TV(){
        
    }
    
    //methods
    public void turnOn(){
    on = true;
    }
    
    public void turnOff(){
    on = false;
     }
    
    public void setChannel(int newChannel){
    if(channel>=1 && channel <= 120)        
        channel = newChannel;       
    else
        System.out.println("Channel should be in the range of 1-120");
    }
    
      public void setVolume(int newVolumeLevel){
    if(volume>=1 && volume <= 7)        
       volume = newVolumeLevel;
    else
        System.out.println("Volume should be in the range of 1-7");
    }
      
      public void channelUp(){
         if(channel>=1 && channel < 120)        
        channel ++;
    else
        System.out.println("Channel should be less than 120");          
      }
     public void channelDown(){
         if(channel>1 && channel <= 120)        
        channel --;
    else
        System.out.println("Channel should be less than 120 and greater 1");          
      }
     public void volumeUp(){
         if(volume>=1 && volume<7)
             volume++;
          else
        System.out.println("Volume should be less than 7");  
     } 
     public void volumeDown(){
         
         if(volume>1&& volume<=7)
             volume--;
          else
        System.out.println("Volume should be greater than 1 and less than 7");
     } 
    
    
    
}
