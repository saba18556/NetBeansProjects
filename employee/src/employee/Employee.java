
package employee;

public class Employee {
    
    private int id;
    private String FirstName;
    private String LastName;
    private int salary;
    
    public void Employee(int ID, String firstName, String lastName, int salary){
        
        id = ID;
        FirstName = firstName;
        LastName = lastName;
        this.salary = salary;
        
     }
    
    public int getID(){
        return id;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public String getName(){
        return(FirstName+" "+LastName);
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setSalary(int amount){
        salary = amount;
    }
    
    public int getAnnualSalary(){
        return salary*12;
    }
    
    public int raiseSalary(int percent){
        salary*=(percent/100);
        return salary;
    }
    
    public String toString(){
        return("ID: "+ id + ", Name: "+ FirstName + " " + LastName + ", Salary: "+ salary);
    }

    public static void main(String[] args) {
       
    }
    
}
