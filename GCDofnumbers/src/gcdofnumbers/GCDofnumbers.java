
package gcdofnumbers;
import java.util.Scanner;

public class GCDofnumbers {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two numbers= ");
        int a= in.nextInt();
        int b =in.nextInt();
        
        
        while (a!=b){
        if (a>b)
                a-=b;
        else 
              b-=a ;
        }
          
        System.out.println("GCD= "+a);
        
       
               
    }
    
}
