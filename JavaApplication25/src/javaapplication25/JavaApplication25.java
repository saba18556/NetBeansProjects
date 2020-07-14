
package javaapplication25;

import java.util.Scanner;

public class JavaApplication25 {

    public static void main(String[] args) {
        
     Scanner in = new Scanner (System.in);
     System.out.println("enter a value= ");
     int a = in.nextInt();
     int b = 0;
     int rem=0;
     while (a>0){
           rem=a%10;
           if (rem==0){
               
              b++;
           } 
              a/=10;
              
     
     } System.out.println(b);
    }
    
}
