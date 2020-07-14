package person;


import java.util.Scanner;


class persons{
    
    private String name;
    private String Address;
    
   
    public persons(String name, String Address){
        this.name = name;
        this.Address = Address;
        
    }
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return Address;
    }
    
    public void setAddress(String address){
        Address = address;
    }
    public String toString(){
        return("Name: "+ name + ", Address: "+ Address);
    }
}

class student extends persons{
    
    private String program;
    private int year;
    private double fee;
    
    
    public student(String name ,String address, String program, int year, double fee){
       super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
        
    }
    
    public String getProgram(){
        return program;
    }
    
    public void setProgram(String program ){
        
        this.program = program;
        
    }
    
    public int getYear(){
        
        return year;
    }
    
    public void setYear(int year){
        
        this.year = year;
        
    }
    
    public double getFee(){
        
        return fee;
        
    }
    
    public void setFee(double fee){
        
        this.fee = fee;
        
    }
    
    public String toString(){
        
        return ("Student: "+ super.toString()+", Program: "+ program + ", Year: "+ year + ", Fee: "+ fee );
    }
}
    
    class staff extends persons{
        
        private String school;
        private double pay;
        
        public staff (String name, String address, String school, double pay){
            
            super(name,address);
            this.school = school;
            this.pay = pay;
            
        }
        
        public String getSchool(){
            return school;
        }
        
        public void setSchool(String school){
            this.school = school;
            
        }
        
        public double getPay(){
            return pay;
        }
        
        public void setPay(double pay){
            this.pay = pay;
        }
        
        public String toString(){
            return ("Staff: "+ super.toString() + ", School: "+ school + ", Pay: "+ pay);
        }
    }


public class Person {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        
        
        int stdc = 0;
        student[] arr1 = new student[10];
        int stfc = 0;
        staff[] arr2 = new staff[10] ;
        boolean p = true;
        
        do{
        System.out.println("Enter;");
        System.out.println("1. for adding student information");
        System.out.println("2. for adding staff informatio");
        System.out.println("3. to display All student information");
        System.out.println("4. to display All staff information");
        System.out.println("5. to find a student by name");
        System.out.println("6. to end the program");
        int n = in.nextInt();
        
        switch(n){
            case 1 :
    
                if(stdc<10){
                    System.out.print("Name: ");
                    String name1 = in.next();
                    System.out.print("Address: ");
                    String address1 = in.next();
                    System.out.print("Program: ");
                    String program = in.next();
                    System.out.print("Year: ");
                    int year = in.nextInt();
                    System.out.print("Fee: ");
                    double fee = in.nextDouble();
                    arr1[stdc] = new student(name1, address1, program, year, fee);
                    System.out.println("Student---> " +arr1[stdc]);
                    stdc++;
                }
                
                else
                    System.out.println("Limit exceeded");
            break;
                
            case 2 :
                if (stfc<10){
                    System.out.print("Name: ");
                    String name2 = in.next();
                    System.out.print("Address: ");
                    String address2 = in.next();
                    System.out.print("School: ");
                    String school = in.next();
                    System.out.print("Pay: ");
                    double pay = in.nextDouble();
                   arr2[stfc] = new staff(name2, address2, school, pay);
                    System.out.println("Staff---> "+ arr2[stfc]);
                     stfc++;
                }
                else
                    System.out.println("Limit exceeded");
            break;
                
            case 3:
                for (int i=0; i<stdc ; i++){
                    System.out.println("Student---> " +arr1[i]);
                }
            break;
                
            case 4:
                for(int i=0; i<stfc; i++){
                    System.out.println("Staff---> "+arr2[i]);
                }
            break;
                
            case 5:
                System.out.println("Enter student name: ");
                String Name = in.next();
                boolean check = false;
                for(int i=0; i<stdc; i++){
                    if(Name.equals(arr1[i].getName())){
                        System.out.println("The index no. is "+ i);
                        check = true;
                        break;
                    }
                }
            if(check==false){
                System.out.println("Student does not exist");
            }
            break;
            
            case 6:
                System.exit(0);
                break;
        }
        
        }
        while(p==true);
        
        
        
        }
        
        
    }
    


