
package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
        
        
      //Create a scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to place value
        System.out.print("enter the tmep in fahrenheit = ");
        double F = input.nextDouble();
        
        //Compute result
        double C = (F -32)*(5/9.0);
        
        //Display result
        System.out.println("the Temperature in C of Fahrenheit F =" + F + " is C "+ C );
    }
    
}
