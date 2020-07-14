
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("the amount= ");
        double amount = in.nextDouble();
        
        int dollar = (int) amount;
        System.out.println("the dollar will be= " + dollar);
        
        double cents = (amount-dollar)*100;
        int cents1 = (int)cents;
        System.out.println("the cents will be= " + cents1);
        
        double quarters = (amount-dollar)*100/25;
        int quarters1 = (int)quarters;
        System.out.println("quarters will be= " + quarters1);
        
        double dimes = (((amount-dollar)*100)%25)/10;
        int dimes1 = (int) dimes;
        System.out.println("the dimes will be= " + dimes1);
        
        double nickel = (((((amount-dollar)*100)%25)%10)/5);
        int nickel1 = (int) nickel;
        System.out.println("the nickel will be= " + nickel1);
        

        double pennies = ((((amount-dollar)*100)%25)%10)%5;
        int pennies1 = (int) pennies;
        System.out.println("the pennies will be= " + pennies1);
        
                
                
                
        
        
        
        
                
        
       
                        
        

           
    }
    
}
