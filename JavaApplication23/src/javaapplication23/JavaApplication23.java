
package javaapplication23;

import java.util.Scanner;

public class JavaApplication23 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //taking input
        System.out.println("Enter a number= ");
        int a = in.nextInt();
        int b = a;
      
       
        //initializing
        
        int rem= 0;
        int rem1= 0;
       
        // separating each digit
        while (a>0){
        rem=a%10;
        rem1=(rem1*10)+rem;
        a/=10;
        
        
        
        }
        if (b==rem1)  
            System.out.println("It is a palindrome number");
        else 
            System.out.println("Not a palindrome number");
        
               
        
        
                
        
          
    }
    
}
