/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author Saba fatima
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //prompt input from user
        System.out.println("Enter a 7 digit number= ");
        int number= in.nextInt();
        
        //Calculation
        int A= number/1000000;
        int A1= (int)A;
        int B= number/100000;
        int B1= (int)B;
        int B2= B1%10;
        int C= number/10000;
        int C1= (int)C;
        int C2= C1%100;
        int C3= C2%10;
        int D= number/1000;
        int D1= (int)D;
        int D2= D1%1000;
        int D3= D2%100;
        int D4= D3%10;
        int E= number/100;
        int E1= (int)E;
        int E2= E1%10000;
        int E3= E2%1000;
        int E4= E3%100;
        int E5= E4%10;
        int F= number/10;
        int F1= (int)F;
        int F2= F1%100000;
        int F3= F2%10000;
        int F4= F3%1000;
        int F5= F4%100;
        int F6= F5%10;
        int G= number/1;
        int G1= G%1000000;
        int G2= G1%100000;
        int G3= G2%10000;
        int G4= G3%1000;
        int G5= G4%100;
        int G6= G5%10;
        if ((A1==G6)||(B2==F6)||(C3==E5))
            System.out.println("It is a palindrome number");
        else
            System.out.println("It is not a palindrome number");
    }
    
}
