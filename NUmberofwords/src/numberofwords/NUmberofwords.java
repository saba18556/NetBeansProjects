/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofwords;

import java.util.Scanner;

/**
 *
 * @author Hammad
 */
public class NUmberofwords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
         int count=0;
          System.out.println("Enter a string");
          String cc=in.nextLine();
         String[] b = cc.split("(?=\\p(Upper))");
        for (int i=0; i<b.length; i++){
            count++;
        }
        System.out.println("The words are"+count);

    }
    
}
