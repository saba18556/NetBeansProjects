
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number= ");
        int M=in.nextInt();
        int n;
        for (n=1;n<=M;n++){
        int a;
        for (a=0;a<M-n;a++){
            System.out.print("a");
        }
        int k;
        for (k=1;k<=n;k++){
            System.out.print("*");
        }
        int b;
        for(b=1;b<n;b++){
            System.out.print("b");}
            System.out.print("\n");
        }
    }
    
}
