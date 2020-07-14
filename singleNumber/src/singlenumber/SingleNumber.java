
package singlenumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

interface Ipayment{
 void payment();
}

abstract class Supplier implements Ipayment{
    String name,des;
    int qty;
    double perunitcost;
    @Override
    public abstract void payment();
    public Supplier(String name, String des, int qty, double perunitcost){
        this.name=name;
        this.des=des;
        this.qty=qty;
        this.perunitcost = perunitcost;
    }
    @Override
    public String toString(){
    return "name: "+name+" /n des: "+des+" /n quantity: "+qty+" /n price per unit cost: "+perunitcost;
    }
}
  class GrocerySupp extends Supplier{
    double total;
    public GrocerySupp(String name, String des, int qty, double perunitcost) {
        super(name, des, qty, perunitcost);
    }
    @Override
    public void payment(){
        total= qty*perunitcost;
    }
    public double getPayment(){
        return total;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
class ElecSupp extends Supplier{
double total;
    public ElecSupp(String name, String des, int qty, double  perunitcost) {
        super(name, des, qty, perunitcost);
    }

    @Override
    public void payment(){
        total= qty*perunitcost;
    }
    public double getPayment(){
        return total;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
class CosmSupp extends Supplier{
    double total;
    public CosmSupp(String name, String des, int qty, double  perunitcost) {
        super(name, des, qty, perunitcost);
    }
     
    @Override
    public void payment(){
         total= qty*perunitcost;
     }
    public double getPayment(){
        return total;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
}


abstract class Employee implements Ipayment{
 private String firstName, lastName;
 private String SSN;
 public Employee(String firstName,String lastName, String SSN){
     this.firstName= firstName;
     this.lastName=lastName;
     this.SSN=SSN;
 }
 @Override
 public abstract void payment ();
 public String toString(){
     return firstName+" "+lastName+"\nsocial security number: "+SSN;
 }
}
class SalariedEmployee extends Employee{
    private double weeklysal;
     public SalariedEmployee(String firstName,String lastName, String SSN,double weeklysal){
      super(firstName,lastName,SSN);
      this.weeklysal=weeklysal;}
@Override
public void payment(){
   getEarning();
}
public double getEarning(){
    return weeklysal;
}
public String toString(){
    return "salaried employee: "+ super.toString()+"\nweekly wage: "+weeklysal+"\nearned: "+getEarning();
}
}
class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    private double totalSal;
    public HourlyEmployee(String firstName,String lastName, String SSN, double wage, double hours){
      super(firstName,lastName,SSN);
       this.wage=wage;
       this.hours=hours;}
@Override
public void payment(){
    
    if (hours<=40){
        totalSal=wage*hours;
    }
    else if(hours>40){
        totalSal= 40*wage+(hours-40)*wage*1.5;
    }
    
}
public double getEarning(){
    return totalSal;
}
public String toString(){
    return "hourly employee: "+super.toString()+"\nhourly wage: "+wage+"\nhours worked: "+hours+"\nearned: "+getEarning();
}
}
class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    private double totalSal;
     public CommissionEmployee(String firstName,String lastName, String SSN, double grossSales, double commissionRate){
      super(firstName,lastName,SSN);
     this.commissionRate=commissionRate;
     this.grossSales=grossSales;}
     @Override
     public void payment(){
     totalSal= commissionRate*grossSales;
}
     public double getEarning(){
    return totalSal;
}
    public String toString(){
        return "commission employee: "+super.toString()+"\ngross sales: "+grossSales+"\ncommission rate: "+commissionRate+" \nearned: "+totalSal;
    }
    public double getcommissionRate(){
        return commissionRate;
    }
    public double getgrossSales(){
        return grossSales;
    }
}
class BasePlusCommissionEmployee extends  CommissionEmployee{
    private double baseSal;
    private double totalSal;
     public BasePlusCommissionEmployee(String firstName,String lastName, String SSN, double grossSales, double commissionRate, double baseSal){
      super(firstName,lastName,SSN,grossSales,commissionRate);
     this.baseSal=baseSal;}
      @Override
public void payment(){
    totalSal=(getcommissionRate()*getgrossSales()) +increasedBaseSal();
}
public double increasedBaseSal(){
   return baseSal= (0.1*baseSal)+baseSal;
}
    @Override
 public String toString(){
     return "base salaried "+super.toString()+" base salary: "+baseSal+"\nnew base salary with 10% increase is "+increasedBaseSal()+"\nearned: "+totalSal;
 }

}

public class SingleNumber {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Ipayment> paylist = new ArrayList<>();
        
        System.out.print("Press 1 for entering Employee or Press 2 for entering Supplier or Press 9 for exit: ");
        int ch=input.nextInt();
        while(true){
        switch(ch){
        case 1:{
            System.out.println("Enter the type of Employee:(S for Salaried, H for Hourly, C for Commission and BP for BasePlusCommission, press 9 to exit: ");
            String type= input.next();
             switch(type){
             case "S":
            {
                System.out.println("Enter first name: ");
                String Fname= input.next();
                System.out.println("Enter last name: ");
                String Lname= input.next();
                System.out.println("Enter SSN: ");
                String SSN = input.next();
                System.out.println("Enter weekly Salary: ");
                double sal= input.nextDouble();
                 System.out.println("***********************************************");
                System.out.println("");
                paylist.add(new SalariedEmployee(Fname,Lname, SSN, sal));
                break;
            }
             case "H": {
                System.out.println("Enter first name: ");
                String Fname= input.next();
                System.out.println("Enter last name: ");
                String Lname= input.next();
                System.out.println("Enter SSN: ");
                String SSN = input.next();
                System.out.println("Enter wage: ");
                double wage= input.nextDouble();
                System.out.println("Enter hours worked: ");
                int hours = input.nextInt();
                 System.out.println("***********************************************");
                System.out.println("");
                paylist.add(new HourlyEmployee(Fname,Lname,SSN,hours,wage));
                break;
            }
            case "C": {
                 System.out.println("Enter first name: ");
                String Fname= input.next();
                System.out.println("Enter last name: ");
                String Lname= input.next();
                System.out.println("Enter SSN: ");
                String SSN = input.next();
                System.out.println("Enter gross sales: ");
                double Gsales= input.nextDouble();
                System.out.println("Enter the commission rate: ");
                double rate= input.nextDouble();
                 System.out.println("***********************************************");
                System.out.println("");
                paylist.add(new CommissionEmployee(Fname,Lname,SSN,Gsales,rate) );
                break;
            }
            case "BP":{
              System.out.println("Enter first name: ");
                String Fname= input.next();
                System.out.println("Enter last name: ");
                String Lname= input.next();
                System.out.println("Enter SSN: ");
                String SSN = input.next();
                System.out.println("Enter gross sales: ");
                double Gsales= input.nextDouble();
                System.out.println("Enter the commission rate: ");
                double rate= input.nextDouble();
                System.out.println("Enter the base salary: ");
                double baseSal= input.nextDouble();
                System.out.println("***********************************************");
                System.out.println("");
                paylist.add(new BasePlusCommissionEmployee(Fname,Lname,SSN,Gsales,rate,baseSal));
                break;
                }
            case "9":{
                System.exit(0);
                break;
            }
            default: System.out.println("Error");
            }
        break;}
        case 2:{
        System.out.println("Enter the type of Supplier: C for Cosmetic, E for Electric, G for Grocery, 9 to Exit: ");
        String type= input.next();
        switch(type){
        case "C":{
        System.out.println("Enter name of Product: ");
        String name= input.next();
        System.out.println("Enter destination: ");
        String des= input.next();
        System.out.println("Enter quantity: ");
        int qty= input.nextInt();
        System.out.println("Enter price per unit: ");
        double price= input.nextDouble();
         System.out.println("***********************************************");
                System.out.println("");
        paylist.add(new CosmSupp(name,des,qty,price));
        break;
          }
    case "E":{
     System.out.println("Enter name of Product: ");
        String name= input.next();
        System.out.println("Enter destination: ");
        String des= input.next();
        System.out.println("Enter quantity: ");
        int qty= input.nextInt();
        System.out.println("Enter price per unit: ");
        double price= input.nextDouble();
         System.out.println("***********************************************");
                System.out.println("");
        paylist.add(new ElecSupp(name,des,qty,price));
        break;
    }
    case "G":{
     System.out.println("Enter name of Product: ");
        String name= input.next();
        System.out.println("Enter destination: ");
        String des= input.next();
        System.out.println("Enter quantity: ");
        int qty= input.nextInt();
        System.out.println("Enter price per unit: ");
        double price= input.nextDouble();
         System.out.println("***********************************************");
                System.out.println("");
        paylist.add(new GrocerySupp(name,des,qty,price));
        break;
    }
    case "9":{
        System.exit(0);
        break;
    }
        
    
        
        default: System.out.println("Incorrect input");
    }}
        
        for(Ipayment t: paylist){
            
        }
        
        
        
        
        
    }
    
}
    }
}
