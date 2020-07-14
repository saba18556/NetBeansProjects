/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;
import java.util.Scanner;
/**
 *
 * @author Saba fatima
 */
public class Leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //Prompt the user for input
        System.out.println("enter the year= ");
        int year = in.nextInt();
        
        if ((year%4==0)&&(year%100!=0))
                System.out.println("It is a leap year");
        else if ((year%4==00)||(year%400==0))
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
          
    
      
          
        
        
        
        
    }
    
}
