
package inheritance;

import java.util.Scanner;


    class Person{
private String name;
private String address;

Person(){
    
}
public Person(String name, String address){
    this.name=name;
    this.address=address;
}
public String getName(){
    return name;
}
public String getAddress(){
    return address;
}
public void setAddress(String address){
this.address=address;
}
public String toString(){
    return ("Name=" + name + " Address=" + address);
}
}
 class Student extends Person{
private String program;
private int year;
private double fee;

public Student(String name, String address, String program, int year, double fee){
    super(name,address);
    this.program=program;
    this.year=year;
    this.fee=fee;
}
public String getProgram(){
    return program;
}
public void setProgram(String program){
    this.program=program;
}
public int getYear(){
return year;
}
public void setYear(int year){
    this.year=year;
}
public double getFee(){
    return fee;
}
public void setFee(double fee){
    this.fee=fee;
}
public String toString(){
    return ("Student:  " + super.toString()+ " Program=" + program + " Year=" + year + " Fee=" + fee);
}
}

 class Staff extends Person{
    private String school;
    private double pay;
    
public Staff(String name, String address,String school, double pay){
    super(name,address);
    this.school=school;
    this.pay=pay;
}
public String getSchool(){
    return school;
}
public void setSchool(String school){
    this.school=school;
}
public double getPay(){
    return pay;
}
public void setPay(double pay){
    this.pay=pay;
}
public String toString(){
    return ("Staff:  " + super.toString()+ " School=" + school + " Pay=" + pay);
}
}

public class Inheritance {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        Student[] StudentArr=new Student[3];
        Staff[] StaffArr=new Staff[10];
        int StudentCounter=0;
        int StaffCounter=0;
       
        boolean Run=true;
        
        do {
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("Press a number to perform the corresponding action:");
        System.out.println("1. Register Student");
        System.out.println("2. Register Staff");
        System.out.println("3. Print Student Data");
        System.out.println("4. Print Staff Data");
        System.out.println("5. Search Student");
        System.out.println("6. Exit from program");
        System.out.println("");
        System.out.print("Enter a number here -> ");
        
        int number=in.nextInt();
        
        System.out.println("");
        
        switch (number) {
        
            case 1:
                if (StudentCounter<10){
                    System.out.print("Name: ");
                    String Name=in.next();
                    System.out.print("Address: ");
                    String Address=in.next();
                    System.out.print("Program: ");
                    String Program=in.next();
                    System.out.print("Year: ");
                    int Year=in.nextInt();
                    System.out.print("Fee: ");
                    double Fee=in.nextDouble();
                
                    StudentArr[StudentCounter]=new Student(Name,Address,Program,Year,Fee);
                    System.out.println(StudentArr[StudentCounter].toString());
                    StudentCounter++;
                }
                
                else {
                    System.err.println("STUDENT LIMIT EXCEEDED ");
                }
              break;
                
            case 2:
                
                if (StaffCounter<10){
                    System.out.print("Name: ");
                    String Namee=in.next();
                    System.out.print("Address: ");
                    String Addresss=in.next();
                    System.out.print("School: ");
                    String School=in.next();
                    System.out.print("Pay: ");
                    double Pay=in.nextDouble();   

                    StaffArr[StaffCounter]=new Staff(Namee,Addresss,School,Pay);
                    System.out.println(StaffArr[StaffCounter].toString());
                    StaffCounter++;
                }
            
                else {
                    System.err.println("STAFF LIMIT EXCEEDED");
                }
            break;
                
            case 3:
                System.out.println("Number of students: " + StudentCounter);
                for (int i=0; i<StudentCounter; i++){
                    System.out.println("* " + StudentArr[i].toString());
                }
            break;
                
            case 4:
                System.out.println("Number of staff: " + StaffCounter);
                for (int i=0; i<StaffCounter; i++){
                    System.out.println("* " + StaffArr[i].toString());
                }
            break;
                
            case 5:
                System.out.print("Enter Student name: ");
                String nameee=in.next();
                boolean std=false;
                for (int i=0; i<StudentCounter; i++){
                    if (nameee.equals(StudentArr[i].getName())){
                        System.out.println("Index # " + i);
                        System.out.println(StudentArr[i].toString());
                        std=true;
                        break;
                    }
                    else
                        System.out.println("Student not exist");
                }
                if (std==false)
                        System.err.println("Student does not exist.");
                    
                
            break;
            case 6:
                System.err.println("PROGRAM ENDED");
                Run=false;
                break;
                
        }
        
        }
        while (Run==true);
    }
    
}
