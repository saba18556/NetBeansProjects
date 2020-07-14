
package binary2;

import java.util.Scanner;

public class Binary2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a dec number");
        int n = in.nextInt();
         long binaryNumber = 0;
        int remainder, i = 1, step = 1;
        while (n!=0)
        {
            remainder = n % 2;
            System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n/2);
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        System.out.println(binaryNumber); 
         
    
}
}