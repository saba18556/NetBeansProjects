
package javaapplication14;

import java.util.Scanner;

 // @author Saba fatima
 
public class JavaApplication14 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //prompt input
         System.out.println("Enter your weight in kilograms= " );
         double W = in.nextDouble();
         System.out.println("Enter your height in meters= ");
         double H = in.nextDouble();
       
        
        //Conditions
        double BMI = (W)/(H*H);
        if (BMI<16)
            System.out.println("The BMI will be= "+BMI+"serious underweight");
        else if ((BMI>=16) && (BMI<18))
                System.out.println("The BMI will be= "+BMI+"underweight");
                else if ((BMI>=18) && (BMI<24))
                        System.out.println("The BMI will be= "+BMI+"normal weight");
                        else if ((BMI>=24) && (BMI<29))
                                System.out.println("The BMI will be= "+BMI+"overweight");
                                else if ((BMI>=29) && (BMI<35))
                                        System.out.println("The BMI will be= "+BMI+"seriously overweight");
                                        else 
                                                System.out.println("The BMI will be= "+BMI+"gravely overweight");
        
    }
    
}
