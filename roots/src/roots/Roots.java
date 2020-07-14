/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roots;
import java.util.Scanner;
/**
 *
 * @author Saba fatima
 */
public class Roots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //input a,b,c
        System.out.println("Enter a,b and c from the equation= ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double discriminant= (b*b)-4*(a*c);
        //find the discriminant;
         
        
          if  (discriminant>=0)
         if (a>0)
        { double sqroot= Math.sqrt(discriminant);
            double root1= (-b + sqroot)/2*a;
         double root2= (-b - sqroot)/2*a;
            System.out.println(root1 + " is first root and " + root2 +" is second root");}
        
        
        else
            System.out.println("either discriminant is negative or a is zero");
        
        
    }
    
}
