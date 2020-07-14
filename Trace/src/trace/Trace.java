package trace;

import java.util.Scanner;

public class Trace {
    public static void trace (int n, String[] s){
        
        int r;
         r=n%10;
         if (n>=10){
             trace(n/10,s);
            
        }
         System.out.println(s[r]);
      }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numbers = "zero, one, two, three, four, five, six, seven, eight, nine";
        String[] s1 = numbers.split(",");
        System.out.println("Enter a number in integer");
        int a =in.nextInt();
        System.out.println("The output will be");
        trace(a,s1);
    }
    
}
