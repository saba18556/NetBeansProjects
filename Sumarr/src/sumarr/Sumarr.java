
package sumarr;

import java.util.Scanner;

public class Sumarr {
    
    public static int Sum(int[] a){
        int sum =0;
        for (int i=0;i<a.length;i++){
            sum=sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        
       Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the values for your array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The sum of all values will be:");
        System.out.println(Sum(arr));
    }
 }
    

