/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid2;

import java.util.Scanner;

/**
 *
 * @author Saba fatima
 */
public class Pyramid2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number= ");
        int m = in.nextInt();
        int odd=1;
        int start;
        for (int n=1;n<=m;n++){
            start=n;
            for (int b=1;b<=m-n;b++){
                System.out.print(" ");
            }
        for (int c=1; c<=odd;c++){
           
            int middle=odd/2+1;
            System.out.print(start);
            if(c<middle){
            start--;
            }
            else 
            start++;
            
            }System.out.println();
          odd=odd+2;
        }
        }
    }
    

