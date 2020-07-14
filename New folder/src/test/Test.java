
package test;

class TV{
    
    int channel;
    int volumeLevel;
    boolean on;
    
    TV(){
      channel = 0;
      volumeLevel = 0;
      on = false;
    }
    
     public void turnOn(){
         on = true;
     }
     
     public void turnOff(){
         on = false;
     }
     
     public void setChannel(int newChannel){
         
         if(on==true && newChannel>=0 &&  newChannel<=100)
         channel = newChannel;
     
         
     }
     
     public void setVolume(int newVolumeLevel){
         
         if(on==true && newVolumeLevel>=0 && newVolumeLevel<=100)
              
             volumeLevel = newVolumeLevel;
         
     }
     
     public void ChannelUp(){
         
         if(on==true && channel>=0 && channel<100)
             channel++;
         
     }
     
     public void ChannelDown(){
         
         if(on==true && channel>=0 && channel<100)
             channel--;
         
     }
     
     public void volumeUp(){
         
         if(on==true && volumeLevel>=0 && volumeLevel<=100)
             volumeLevel++;

     }
     
     public void volumeDown(){
         
         if(on==true && volumeLevel>=0 && volumeLevel<=100)
             volumeLevel--;
     }
     
     public void display(){
         System.out.println("Channel: "+ channel + " Volume: " + volumeLevel);
     }
}
public class Test {

    public static void main(String[] args) {
        
         TV obj1= new TV();
        obj1.turnOn();
        obj1.volumeUp();
        obj1.setChannel(38);
        obj1.display();
    
    }
    
}
