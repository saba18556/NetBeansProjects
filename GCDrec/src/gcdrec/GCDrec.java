
package gcdrec;

import java.util.Scanner;


public class GCDrec {
    
    public static int GCD(int a, int b){
        if(b!=0)
            return GCD(b,a%b);
        else
        return a;
    } 

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter any two numbers");
        int a =in.nextInt();
        int b=in.nextInt();
        System.out.println("The GCD will be "+GCD(a,b));
        
    }
    
}
