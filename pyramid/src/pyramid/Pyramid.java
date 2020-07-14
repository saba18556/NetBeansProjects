
package pyramid;
import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number= ");
         int M = in.nextInt();
         int n;
         
      
       for (n=1;n<=M;n++){
           int a;
           for (a=0;a<M-n;a++){
               System.out.print(" ");
           }
           
           int b;
          
           for (b=1;b<=n;b++){
               System.out.print(b);
               }
           
           int c;
           for (c=n-1;c>=1;c--){
               
               System.out.print(c);
           }
               System.out.println();
               
           }
           
                   
       }
        
        
    }
    

