
package addressbook18556;

import java.io.IOException;
import java.io.RandomAccessFile;

class Addressbook{
    private String name;
    private String street;
    private String state;
    private String city;
    private String zip;
    
    public void write(RandomAccessFile file) throws IOException {
        
        StringBuffer sb1;
        if (name != null)
            sb1 = new StringBuffer(name);
        else
            sb1 = new StringBuffer();

        sb1.setLength(20);
        file.writeChars(sb1.toString());
        
        StringBuffer sb2;
        if(street!=null)
            sb2 = new StringBuffer(street);
        else
            sb2 = new StringBuffer();
        
        sb2.setLength(30);
        file.writeChars(sb2.toString());
        
        StringBuffer sb3;
        if(city!=null)
            sb3 = new StringBuffer(city);
        else
            sb3 = new StringBuffer();
        
        sb3.setLength(15);
        file.writeChars(sb3.toString());
        
        StringBuffer sb4;
        if(state!=null)
            sb4 = new StringBuffer(state);
        else
            sb4 = new StringBuffer();
        
        sb4.setLength(15);
        file.writeChars(sb4.toString());
        
        StringBuffer sb5;
        if(zip!=null)
            sb5 = new StringBuffer(zip);
        else
            sb5 = new StringBuffer();
        
        sb5.setLength(5);
        file.writeChars(sb5.toString());
        

    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public void setStreet(String street){
        
        this.street = street;
    }
    
    public void setCity(String city){
        
        this.city = city;
    }
    
    public void setState(String state){
        
        this.state = state;
    }
    
    public void setZip(String zip){
        
        this.zip = zip;
    }
    
    public String getName(){
        
        return name;
    }
    
    public String getStreet(){
        
        return street;
    }
    
    public String getCity(){
        
        return city;
    }
    
    public String getState(){
        
        return state;
    }
    
    public String getZip(){
        
        return zip;
    }
    
}

public class AddressBook18556 {

    public static void main(String[] args) {
        
    }
    
}
