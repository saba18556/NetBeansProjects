/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumof.array;

import java.util.Scanner;

/**
 *
 * @author Hammad
 */
public class SumofArray {

    /**
     * @param args the command line arguments
     */

        // TODO code application logic here
    public static int sumArr(int[] ar){
                int sum=0;
        for(int i=0; i<ar.length; i++){
            sum= sum+ar[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of an array");
        int size= in.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the values of array");
        for(int i=0; i<arr.length; i++ ){
            arr[i]=in.nextInt();
        }
        System.out.println("The sum is " +sumArr(arr));
    }
    

    }
    
