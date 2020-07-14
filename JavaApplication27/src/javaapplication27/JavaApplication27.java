
package javaapplication27;

import java.util.Scanner;

public class JavaApplication27 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        
        int M = 7;//in.nextInt();
        int odd=1;
        int start;
        for (int n=1;n<=M;n++){
            if (n<M/2+1){
            start = n;
            }
            else 
                start = (8-n);//M+1)-n;}
        
        for (int j=1;j<=odd;j++){
            int N = M/2+1;
            System.out.print(start);
            if (j<N){
            start--;
            }
            else 
            start++;
            
        }
            System.out.println();
            if (n<4)//M/2+1)
            {
            odd = odd + 2;
            }
            else{
                odd=odd-2;
            }
            
        }
        
    }
    
}
