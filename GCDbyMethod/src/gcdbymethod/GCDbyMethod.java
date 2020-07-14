
package gcdbymethod;

import java.util.Scanner;

public class GCDbyMethod {
    
    public static int GCD(int a, int b){
        while(a!=b){
            if (a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter two integers for GCD");
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println("GCD will be\n"+ GCD(n1,n2));
        
    }
    
}
