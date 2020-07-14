
package example12.pkg4;

import java.util.Scanner;


public class Example124 {
    
    public static int quotient(int number1, int number2){
        if (number2==0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1/number2;
    } 

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter number 1 an integer");
        int a = in.nextInt();
        
        System.out.println("Enter number 2 an integer");
        int b = in.nextInt();
        
        try{
            int result = quotient(a,b);
            System.out.println(a + "/"+ b + " is " + result);
            
        }
        catch(ArithmeticException ex){
            System.out.println("Exception: an integer"+ " cannot be divided by zero");
        
        }
        System.out.println("Execution continues");
        
    }
    
}
