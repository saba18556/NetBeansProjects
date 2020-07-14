
package customers;

class GoldCustomer extends Customer{
    
    double totalMins =0;
   
    GoldCustomer(){
        super();
    }
    
    GoldCustomer(String name){
        super(name);
    }
    
    public void RecordCall(String callType, double min){
        
        totalMins+=min;
        if (callType.equals("Mobile")){
            
            if (this.totalMins <= 60) {
                double timeleft = 60 - totalMins;
           
           if (timeleft > min) {
               balance += 2.5*min;
               totalMins+=min;
           } 
           
           else {
              balance += (timeleft*2.5);
              balance += (min - timeleft)*0.75;
              totalMins+=min;
           }
            
            } 
            
            else {
               balance += (min*0.75);
               totalMins+=min;
            }
        } 
        
        else {
            
            super.RecordCall("landline", min);
        }
    }
        
    public String toString(){
        return("Name: "+name + ", Current Balance: "+balance);
    }
}

class Customer{
    String name;
    double balance;
    
   Customer(){
       
   }
   public Customer(String name){
       this.name = name;
       
   }
    public void RecordPayment(double amountpaid){
        balance = balance - amountpaid;
    }
    
    public void RecordCall(String callType, double min){
        
       if(callType.equals("landline")){
           balance+=2*min;
       } 
       
      else if(callType.equals("cellphone")){
           balance+=1*min;
       }
    }
    
    public String toString(){
        return("Name: " + name + ", Current balance: "+ balance);
    }
}

public class Customers {

    public static void main(String[] args) {
        
        Customer c1 = new Customer("tuba");
        c1.RecordCall("cellphone", 15);
        c1.RecordPayment(3);
        c1.RecordCall("cellphone", 20);
        System.out.println(c1);
        GoldCustomer c2 = new GoldCustomer("Rida");
        c2.RecordCall("cellphone", 30);
        System.out.println(c2.totalMins);
        System.out.println(c2);
        c2.RecordCall("cellphone", 35);
        System.out.println(c2.totalMins);
        System.out.println(c2);
        
    }
    
}
