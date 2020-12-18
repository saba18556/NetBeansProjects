
package sample;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    
    static int removeDuplicates(int arr[], int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
    
     public static int binarySearch(int[] list, int num){
        
        int min =0;
        int max = list.length - 1;
        
       while(min<=max){
           
           int key = (min+max)/2;
           if(list[key]<num){
               min = key + 1;
           }
           else if(list[key]> num){
               max = key -1;
           }
           else{
               return key;
           }
       }
       
       return -(min+1);
        
    }
    

    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Input array size ");
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        
        System.out.print("input number to be found  ");
        int n = in.nextInt();
        Arrays.sort(arr);
        removeDuplicates(arr,size);
        boolean b = true;
        System.out.println("Doing sequential search ");
        long start1 = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(n + " found at index " + i);
                b = false;
                break;
            }
        }
        if (b) {
            
            System.out.println("Not Found");
            
        }
        long end1 = System.nanoTime();
        System.out.println("Time taken for linear search = "+(end1-start1));
        System.out.println("doing binary search");
        long start2 = System.nanoTime();
        int x = binarySearch(arr, n);
        long end2 = System.nanoTime();
        
        if (x <= 0) {
            System.out.println("not found");
        } else {
            System.out.println(n + " found at index " + x);
        }
        System.out.println("time taken for binary search "+(end2-start2));
    }
    
}
