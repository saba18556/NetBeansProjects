/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angryprofessor;

import java.util.Scanner;

/**
 *
 * @author Hammad
 */
public class AngryProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        testCases: 
        for(int i = 0; i < t; i++)
        {
            int n = input.nextInt();
            int k = input.nextInt();
            int onTime = 0;
            for(int j = 0; j < n; j++)
            {
                int arrivalTime = input.nextInt();
                if(arrivalTime <= 0)
                {
                    onTime++;
                }
            }
            if(onTime >= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");   
            }
        }
    }
}
            