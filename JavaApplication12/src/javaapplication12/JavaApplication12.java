
package javaapplication12;

import javax.swing.JOptionPane;

public class JavaApplication12 {

    
    public static void main(String[] args) {
        
        String string = JOptionPane.showInputDialog(null,"Enter a 3 digit number ","Example",JOptionPane.QUESTION_MESSAGE);
        
        int A = Integer.parseInt(string);
        int B = A/10;
        int B1= (int)B;
        int C = A%10;
        int C1 = (int)C;
        int D = B1/10;
        int D1= (int)D;
        int E = B1%10;
        int E1 = (int)E;
        
        //Display results
        int Value1 = C1+D1+E1;
        System.out.println("The sum will be= " + Value1);
        int Value2 = C1*D1*E1;
        System.out.println("The product will be= " + Value2);
        
        
        
        
        
        
        
        
        
        
        
        
  }
    
}
