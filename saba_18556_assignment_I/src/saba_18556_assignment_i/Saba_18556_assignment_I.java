
package saba_18556_assignment_i;

import java.util.Scanner;

class Emergency{
    
    private String name;
    private int phoneNumber;
    private String placeOfEmergency;
    private String emergency;
    private String Aid;
    private String answer;
    
    Scanner inn = new Scanner(System.in);
    Emergency(){
        
    }
    
    Emergency(String name, String location, int cellNumber){
        
        this.name = name;
        placeOfEmergency = location;
        phoneNumber = cellNumber;
        
    }
    
    Emergency(String location, int number){
        
        placeOfEmergency = location;
        phoneNumber = number;
    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public void setPhone(int number){
        
        this.phoneNumber = number;
        
    }
    
    public void setPlace(String location){
        
        placeOfEmergency = location;
    }
    
    public int getNumber(){
        
        return phoneNumber;
        
    }
    
    public String getName(){
        
        return name;
        
    }
    
    public String getLocation(){
        
        return placeOfEmergency;
        
    }
    
    public String Explain(){
        inn.next();
        answer=inn.nextLine();
        return answer;
    }
    
    public void setEmergency(String emergency){
        
       
            if(emergency.contains("accident")){
                this.emergency = "accident";
            }
            
          else if(emergency.contains("robbery")){
                this.emergency = "robbery";
                
            }
          else if(emergency.contains("fire")){
                this.emergency = "fire";
            }
            
          else{
              System.out.println("Situation is not identified. Kindly choose the appropriate support. 1. Ambulance, 2. Police, 3. Fire Fighters");
                        inn.next();
                        String sc = inn.next();
                        if(sc.equals("Police")){
                            this.emergency = "Police case";
                            
                        }
                        else if(sc.equals("Ambulance")){
                            this.emergency = "accident";
                            
                        }
                        else if(sc.equals("Fire")){
                            this.emergency = "Fire emergency";
                        }
          }
        
        
    }
    
    public void setAid(String nature){
        
        if(nature.equals("accident")){
            this.Aid = "Ambulance";
        }
        
        if(nature.equals("robbery")){
            this.Aid = "Police";
        }
        
        if(nature.equals("fire")){
            this.Aid = "Fire Fighters";
        }
    }
    
    public String getAid(){
        
        return Aid;
        
    }
    
    public String getEmergency(){
        
        return emergency;
        
    }
    
    public void Set_support(String check){
        
        if(check.equals("no")){
            System.out.println("What appropriate support do you need? 1. Ambulance, 2. Police, 3. Fire Fighters");
                            String inp = inn.next();
                            Aid = inp;
        }
        
    }
    
    public void Resolve_Emergency(){
        boolean A=true;
        do{
        boolean YN=true;
        do{
        System.out.println("");
        System.out.println("Operator: We are sending you appropriate support. Please confirm that " + getAid() + " is the required service?");
        System.out.println("");
        System.out.print("Caller: ");
        String check= inn.next();
        System.out.println("");
        if ((check.equals("No"))|| (check.equals("no"))){
            YN=false;
            Set_support(check);
        }
        else YN=true;
        
        }
        while(YN==false);
        
        
        System.out.println("Operator: We have dispatched "+ getAid() +" for " + getLocation() +". Please hold on. Help will be there in a moment.");
        System.out.println("Operator: Is there anything else you want to report? ");
       String cont=inn.next();
        
        if ((cont.equals("Yes"))|| (cont.equals("yes"))){
           
            System.out.println("Operator: Please report your emergency.");
            inn.nextLine();
            String reply1=inn.nextLine();
            setEmergency(reply1);
            setAid(getEmergency());
            System.out.println(toString());
            }
        else 
            A=false;
        
        }
          while (A==true);  
    }
    
    public String toString(){
        
        return("Mr./Ms. " + name +" called from "+ phoneNumber + " and reported an/a " + emergency + " at " + placeOfEmergency);
        
    }
    
   
}

class N911 extends Emergency{
    
    N911(){
        
       super(); 
    
    }
    
    N911(String name, String location, int number){
        
        super(name, location, number);
        
    }
    
     public void TakeInfo(){
       
        System.out.println("Operator: This is 911 emergency support system. Please report you emergency.");
       String reply=inn.nextLine();
        
        
        System.out.println("Operator: Okay, please provide your information:");
        System.out.println("Name: ");
        
        String name=inn.next();
       System.out.println("location: ");
        inn.nextLine();
        String place=inn.nextLine();
        System.out.println("Number: ");
        int num=inn.nextInt();
       
        setName(name);
        setPhone(num);
        setPlace(place);
        setEmergency(reply);
        setAid(getEmergency());
        System.out.println(toString());
    }
    
    public String toString(){
        
        return super.toString();
        
    }

}

class E911 extends Emergency{
    
    E911(){
        
    }
    
    E911(String name, String location, int number){
        
        super(name, location, number);
        
    }
    
    public void TakeInfoE911(){
        
        System.out.println("Operator: This is 911 emergency support system. Please report your emergency.");
        
        System.out.print("Caller: ");
        inn.next();
        String replyy=inn.nextLine();
        System.out.println("");
        setEmergency(replyy);
        setAid(getEmergency());
        System.out.println(toString());
     }
    
    public String toString(){
        
        return ("A/An "+ getEmergency() + " is being reported at " + getLocation() + ", by " + getNumber());
        
    }
    
    
}


public class Saba_18556_assignment_I {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dial 911 for emergency support");
        System.out.println("Dial E911 for enhanced emergency support");
        String n = in.next();
        
        switch(n){
            
            case"911":
                
                N911 obj1 = new N911();
                obj1.TakeInfo();
                obj1.Resolve_Emergency();
                
                break;
                
            case "E911":
                E911 obj2 = new E911("Saba","Karachi",0331271);
                obj2.TakeInfoE911();
                obj2.Resolve_Emergency();
                
                break;
        }
    }
    
}
