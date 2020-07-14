
package example12.pkg3;

import java.util.Scanner;

public class Example123 {

    
    
        public static void quotient(int number1, int number2) {
            
           if (number2 == 0) {
               System.out.println("Divisor cannot be zero");
               System.exit(1);
        }    
           
            System.out.println(number1/number2); 
    }
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter first number ");
            int a=in.nextInt();
            System.out.println("Enter second number ");
            int b=in.nextInt();
            System.out.println("The ans will be");
            quotient(a,b);
    }
    
}
