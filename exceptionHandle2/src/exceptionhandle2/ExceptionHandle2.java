
package exceptionhandle2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter first number");
        double number1= in.nextInt();
        double number2=0;
        
        while(number2==0){
            System.out.println("Enter second number");
            number2=in.nextInt();
        
            try{
                
                 double result = number1/number2;
                 System.out.println("the ans will be " + result);
                
            }
            catch(ArithmeticException ex){
                
                System.out.println("Try Again. (Incorrect Input: divisor should not be zero)");
                in.nextLine();
            }
        }
        
        
      /* if(number2==0)
           System.out.println("Invalid input");
       
       else {
           int result = number1/number2;
           System.out.println("ans will be "+ result);
       }*/
       
           
                }
        
    
    
}
