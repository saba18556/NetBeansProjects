
package labtask_saba18556;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee{
    private String firstName, lastName, ssn;
    
    public abstract void earning();
    
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
    private String weeklySalary;
    
    public void earning(){
        System.out.println("Earning: $"+weeklySalary);
    }
     SalariedEmployee(){
         
     }
     public SalariedEmployee(String firstName, String lastName, String ssn, String weeklySalary){
         super(firstName,lastName,ssn);
         this.weeklySalary=weeklySalary;
     }
     public String toString(){
         return("Salaried Employee: \n"+super.toString()+"\nWeekly Salary: $"+weeklySalary);
     }
}

class HourlyEmployee extends Employee{
    private double hourlyWage, hoursWorked;
    
    public void earning(){
        double earning=0;
        if(hoursWorked<=40)
            earning=hourlyWage*hoursWorked;
        else if(hoursWorked>40)
            earning=40*hourlyWage+(hoursWorked-40)*hourlyWage*1.5;
        System.out.println("Earning: $"+earning);
    }
    HourlyEmployee(){
        
    }
    HourlyEmployee(String firstName, String lastName, String ssn, double hourlyWage, double hoursWorked){
        super(firstName, lastName, ssn);
        this.hourlyWage=hourlyWage;
        this.hoursWorked=hoursWorked;
    }
    public String toString(){
        return ("Hourly Employee: \n"+super.toString()+"\nHourly Wage: $"+hourlyWage+"\nHours Worked: $"+hoursWorked);
    }
}

class CommissionEmployee extends Employee{
    private double grossSales,commissionRate;
    
    public void earning(){
        System.out.println("Earning: $"+(commissionRate*grossSales));
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
    public void earning(){
        System.out.println("Earning: $"+((getCommissionRate()*getGrossSales())+baseSalary+baseSalary*0.1));
    }
    public void salaryRaise(){
        System.out.println("New salary with increase is: $"+(baseSalary=baseSalary+(baseSalary*0.1)));
    }
    public String toString(){
        return ("BasePlus Commission Employee: \n"+super.toString()+"\nBase Salary: $"+baseSalary);
    }
}

public class Labtask_Saba18556 {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
       ArrayList<Employee> array=new ArrayList();
       String b="yes";
       
       while(b.equals("yes")){
       System.out.println("Enter 1 for record of Salaried Employee \nEnter 2 for record of Hourly Employee \nEnter 3 for record of Commission Employee \nEnter 4 for record of BasePlus Commission Employee ");
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
               String weeklySalary=in.next();
               
               array.add(new SalariedEmployee(fName,lName,ssn,weeklySalary));
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
               
               array.add(new HourlyEmployee(fName,lName,ssn,hourlyWage,hoursWorked));
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
               
               array.add(new CommissionEmployee(fName,lName,ssn,grossSales,commissionRate));
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
               
               array.add(new BasePlusCommissionEmployee(fName,lName,ssn,grossSales,commissionRate,baseSalary));
               break;
           }    
       }
        System.out.println("");
        System.out.println("Do you want to add more records? ");
        b=in.next();
        System.out.println("");
    }   
       for(Employee obj: array){
            System.out.println(obj);
            obj.earning();
            if(obj instanceof BasePlusCommissionEmployee)
                ((BasePlusCommissionEmployee)obj).salaryRaise();
            System.out.println("");
       }
        System.out.println("");
       for(Employee obj: array){
           if(obj instanceof SalariedEmployee)
               System.out.println("Employee "+array.indexOf(obj)+" is a SalariedEmployee");
           else if(obj instanceof HourlyEmployee)
               System.out.println("Employee "+array.indexOf(obj)+" is a HourlyEmployee");
           else if(obj instanceof BasePlusCommissionEmployee)
               System.out.println("Employee "+array.indexOf(obj)+" is a BasePlusCommissionEmployee"); 
           else if(obj instanceof CommissionEmployee)
              System.out.println("Employee "+array.indexOf(obj)+" is a CommissionEmployee");
           
       }
        
    }
    
}
