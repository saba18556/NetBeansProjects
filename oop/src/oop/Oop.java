
package oop;

class BankCustomer{
    public String Name;
    String AccNum;
    private double bal;
    
    public void setValues(String n, String acc, double balance){
        Name=n;
        AccNum=acc;
        bal=balance;
    
}
    public void display(){
        System.out.println("Name: "+Name + ", Account Number: "+ AccNum + ", Balance: "+bal);
    }
    
    public void deposit(double x){
        bal=bal+x;
        
        
    }
    public void withdraw(double y){
        bal=bal-y;
    }
    
}
public class Oop {

    public static void main(String[] args) {
         BankCustomer Tuba= new BankCustomer();
        Tuba.setValues("Tuba","A123",100000);
        BankCustomer Saba= new BankCustomer();
        Saba.setValues("Saba", "B456", 120000);
        Tuba.deposit(10);
        Saba.withdraw(10);
        Tuba.display();
        Saba.display();
        
    }
    
}
