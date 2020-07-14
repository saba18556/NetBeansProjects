/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findlargestnumber;
import java.util.Scanner;
/**
 *
 * @author Saba fatima
 */
public class Findlargestnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //prompt input from user
        System.out.println("Enter three numbers= ");
        double number1= in.nextDouble();
        double number2= in.nextDouble();
        double number3= in.nextDouble();
        
        if ((number1>number2)&&(number1>number3))
            System.out.println(number1 + " is greatest");
        else if ((number2>number1)&&(number2>number3))
            System.out.println(number2 + " is greatest");
        else if ((number3>number1)&&(number3>number2))
            System.out.println(number3 + " is greatest");
    
    }
    
}
