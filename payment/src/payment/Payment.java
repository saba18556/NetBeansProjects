
package payment;

import java.util.ArrayList;
import java.util.Scanner;

interface Ipayment{
    
    abstract double payment();
    
}

 abstract class  Employee implements Ipayment{
    
    private String firstName, lastName, ssn;
    
    @Override
    public abstract double payment();
    
    Employee(){
        
    }
    
    Employee(String firstName, String lastName, String ssn){
        
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
    }
    
    public void setFirstName(String firstName){
        
        this.firstName=firstName;
        
    }
    
    public String getFirstName(){
        
        return firstName;
        
    }
    
    public void setLastName(String lastName){
        
        this.lastName=lastName;
        
    }
    
    public String getLastName(){
        
        return lastName;
        
    }
    
    public void setSSN(String ssn){
        
        this.ssn=ssn;
        
    }
    
    public String getSSN(){
        
        return ssn;
        
    }
    
    public String toString(){
        
        return ("Name: "+firstName+" "+lastName+" \nSSN: "+ssn);
        
    }
    
}

class SalariedEmployee extends Employee{
    
    private double weeklySalary;

    
    @Override
    public double payment(){
        
      return(weeklySalary);
      
    }
    
     SalariedEmployee(){
         
     }
     public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary){
         
         super(firstName,lastName,ssn);
         this.weeklySalary=weeklySalary;
         
     }
     
     public String toString(){
         
         return("Salaried Employee: \n"+super.toString()+"\nWeekly Salary: $"+payment());
         
     }
     
}

class HourlyEmployee extends Employee{
    private double hourlyWage, hoursWorked;
    
    @Override
    public double payment(){
        
        double payment=0;
        if(hoursWorked<=40)
            payment=hourlyWage*hoursWorked;
        else if(hoursWorked>40)
            payment=40*hourlyWage+(hoursWorked-40)*hourlyWage*1.5;
        return(payment);
        
    }
    
    HourlyEmployee(){
        
    }
    
    HourlyEmployee(String firstName, String lastName, String ssn, double hourlyWage, double hoursWorked){
        
        super(firstName, lastName, ssn);
        this.hourlyWage=hourlyWage;
        this.hoursWorked=hoursWorked;
        
    }
    
    @Override
    public String toString(){
        
        return ("Hourly Employee: \n"+super.toString()+"\nHourly Wage: $"+hourlyWage+"\nHours Worked: $"+hoursWorked);
        
    }
}

class CommissionEmployee extends Employee{
    
    private double grossSales,commissionRate;
    
    public double payment(){
        
        return(commissionRate*grossSales);
        
    }
    
    public double getCommissionRate(){
        
        return commissionRate;
        
    }
    
    public double getGrossSales(){
        
        return grossSales;
        
    }
    
    CommissionEmployee(){
        
    }
    CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate){
        
       super(firstName, lastName, ssn);
       this.grossSales=grossSales;
       this.commissionRate=commissionRate;
       
    }
    public String toString(){
        
        return("Commission Employee: \n"+super.toString()+"\nGross Sales: $"+grossSales+" \nCommission Rate: "+commissionRate);
        
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    BasePlusCommissionEmployee(){
        
    }
    
    BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales,double commissionRate, double baseSalary){
        
        super(firstName, lastName, ssn, grossSales,commissionRate);
        this.baseSalary=baseSalary;
        
    }
    public double payment(){
        
        return((getCommissionRate()*getGrossSales())+baseSalary+baseSalary*0.1);
        
    }
    
    public void salaryRaise(){
        
        System.out.println("New salary with increase is: $"+(baseSalary=baseSalary+(baseSalary*0.1)));
        
    }
    
    public String toString(){
        
        return ("BasePlus Commission Employee: \n"+super.toString()+"\nBase Salary: $"+baseSalary);
        
    }
}

abstract class Supplier implements Ipayment{
    
    String name, des;
    int qty; 
    double perunitcost;
    public abstract double payment();
    
    Supplier(){
        
    }
    
    Supplier(String name, String add, int qty, double unitCost){
        
        this.name = name;
        des = add;
        this.qty = qty;
        perunitcost =unitCost ;
        
    }
   
    public void setName(String Name){
        
        name = Name;
        
    }
    
    public String getName(){
        
        return("Name: "+name);
        
    }
    
    public void setDes(String add){
        
        des = add;
        
    }
    
    public String getDes(){
        
        return(des);
        
    }
    
    public void setQty(int qty){
        
        this.qty = qty;
        
    }
    
    public int getQty(){
        
        return(qty);
        
    }
    
    public void setUnitcost(double cost){
        
        perunitcost = cost;
        
    }
    
    public double getUnitcost(){
        
        return(perunitcost);
        
    }
    
    public String toString(){
        
        return("Name: "+ name +", Address: "+ des +", quantity: "+ qty + ", unit cost: "+ perunitcost);
        
    }
    
   
}

class ElecSupplier extends Supplier{
    
    public ElecSupplier(String name,String add, int qty, double unitCost){
        
        super(name, add, qty, unitCost);
        
    }
    
    @Override
    public double payment(){
        
       return(getQty()*getUnitcost());
       
    }
    
    @Override
    public String toString(){
        
        return("Electric Supplier: \n"+super.toString()+"\n payment: "+payment());
        
    }

}

class CosmSupplier extends Supplier{
    
    public CosmSupplier(String name,String add, int qty, double unitCost){
        
        super(name, add, qty, unitCost);
        
    }
    
    @Override
    public double payment(){
        
       return(getQty()*getUnitcost());
       
    }
    
    @Override
    public String toString(){
        
        return("Cosmetics Supplier: \n"+super.toString()+"\n payment: "+payment());
        
    }

}

class Grocery extends Supplier{
    
    public Grocery(String name,String add, int qty, double unitCost){
        
        super(name, add, qty, unitCost);
        
    }
    
    @Override
    public double payment(){
        
       return(getQty()*getUnitcost());
       
    }
    
    @Override
    public String toString(){
        
        return("Groceries Supplier: \n"+super.toString()+"\n payment: "+payment());
        
    }

}


public class Payment {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        ArrayList<Ipayment> paylist = new ArrayList<>();
         String b="yes";
       
       while(b.equals("yes")){
       System.out.println("Enter 1 for record of Salaried Employee \nEnter 2 for record of Hourly Employee \nEnter 3 for record of Commission Employee \nEnter 4 for record of BasePlus Commission Employee \nEnter 5 for Electronics Supplier \nEnter 6 for Cosmetics Supplier \nEnter 7 for Groceries Supplier");
       System.out.println("");
       char ch=input.next().charAt(0);
       Scanner in=new Scanner (System.in);
       switch(ch){
           case '1': {
               System.out.println("Salaried Employee: ");
               
               System.out.print("Enter first name: ");
               String fName=in.next();
               System.out.print("Enter last name: ");
               String lName=in.next();
               System.out.print("Enter social security number: ");
               String ssn=in.next();
               System.out.print("Enter weekly Salary: ");
               double weeklySalary=in.nextDouble();
               
               paylist.add(new SalariedEmployee(fName,lName,ssn,weeklySalary));
               break;
           }
           case '2':{
               System.out.println("Hourly Employee: ");
               
               System.out.print("Enter first name: ");
               String fName=in.next();
               System.out.print("Enter last name: ");
               String lName=in.next();
               System.out.print("Enter social security number: ");
               String ssn=in.next();
               System.out.print("Enter Hourly Wage: ");
               double hourlyWage=in.nextDouble();
               System.out.print("Enter Hours Worked: ");
               double hoursWorked=in.nextDouble();
               
               paylist.add(new HourlyEmployee(fName,lName,ssn,hourlyWage,hoursWorked));
               break; 
           }
           case '3': {
               System.out.println("Commission Employee: ");
               
               System.out.print("Enter first name: ");
               String fName=in.next();
               System.out.print("Enter last name: ");
               String lName=in.next();
               System.out.print("Enter social security number: ");
               String ssn=in.next();
               System.out.print("Enter Gross Sales: ");
               double grossSales=in.nextDouble();
               System.out.print("Enter Commission Rate: ");
               double commissionRate=in.nextDouble();
               
               paylist.add(new CommissionEmployee(fName,lName,ssn,grossSales,commissionRate));
               break;
           }
           case '4': {
               System.out.println("BasePlus Commission Employee: ");
               
               System.out.print("Enter first name: ");
               String fName=in.next();
               System.out.print("Enter last name: ");
               String lName=in.next();
               System.out.print("Enter social security number: ");
               String ssn=in.next();
               System.out.print("Enter Gross Sales: ");
               double grossSales=in.nextDouble();
               System.out.print("Enter Commission Rate: ");
               double commissionRate=in.nextDouble();
               System.out.print("Enter Base Salary: ");
               double baseSalary=in.nextDouble();
               
               paylist.add(new BasePlusCommissionEmployee(fName,lName,ssn,grossSales,commissionRate,baseSalary));
               break;
           }
           
           case '5':{
               System.out.println("Electronics Supplier: ");
               
               System.out.print("Product Name: ");
               String name = in.next();
               System.out.print("Address: ");
               String add = in.next();
               System.out.print("Quantity: ");
               int qty = in.nextInt();
               System.out.print("Price per unit: ");
               double price = in.nextDouble();
               
               paylist.add(new ElecSupplier(name, add, qty, price));
               break;
           }
           case '6':{
               System.out.println("Cosmetics Supplier: ");
               
               System.out.print("Product Name: ");
               String name = in.next();
               System.out.print("Address: ");
               String add = in.next();
               System.out.print("Quantity: ");
               int qty = in.nextInt();
               System.out.print("Price per unit: ");
               double price = in.nextDouble();
               
               paylist.add(new CosmSupplier(name, add, qty, price));
               break;
           }
           
           case '7':{
               System.out.println("Groceries Supplier: ");
               
               System.out.print("Product Name: ");
               String name = in.next();
               System.out.print("Address: ");
               String add = in.next();
               System.out.print("Quantity: ");
               int qty = in.nextInt();
               System.out.print("Price per unit: ");
               double price = in.nextDouble();
               
               paylist.add(new Grocery(name, add, qty, price));
               break;
           }
               
       }
        System.out.println("");
        System.out.println("Do you want to add more records? ");
        b=in.next();
        System.out.println("");
    }
       double p =0;
       for(Ipayment temp :  paylist  ){
           
           System.out.println(temp);
           p+= temp.payment();    //temp[i].payment()
           
       }
       
        System.out.println("Total payment will be: "+p);

        
    }
    
}
