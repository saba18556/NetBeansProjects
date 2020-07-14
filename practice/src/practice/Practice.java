
package practice;

import java.util.Scanner;


public class Practice {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println(1D/2D);
        int a= (int)( Math.random()*50);
        System.out.println(a);
       int i=1;
int n = in.nextInt();
boolean prime = true;
for ( i = 2; i<n; i++) {
if (n % i == 0)
prime = false;
else
prime = true;
}
System.out.println(prime);
}
    }
    

