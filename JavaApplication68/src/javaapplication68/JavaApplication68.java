
package javaapplication68;

import java.util.Scanner;

public class JavaApplication68 {
    
    public static int[] append(int[] list1, int[] list2){
        
        int[] final_list=new int[list1.length+list2.length];
        for(int i=0;i<list1.length;i++){
            final_list[i]=list1[i];
        }
        for(int i=list1.length,j=0;i<list1.length+list2.length;i++,j++){
            final_list[i]=list2[j];
        }
        
        return final_list;
       
        
      }
       public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of first array");
        int size1=in.nextInt();
        System.out.println("Enter the size of second array");
        int size2=in.nextInt();
        
        int[] arr1 = new int [size1];
        int[] arr2 = new int [size2];
        int[] arr3 = append(arr1,arr2);
        
        System.out.println("Enter values for list 1");
        for(int i=0;i<arr1.length;i++)
            arr1[i]=in.nextInt();
        
        
        System.out.println("Enter values for list 2");
        for (int i=0;i<arr2.length;i++)
            arr2[i]=in.nextInt();
        
        System.out.println("The appended array will be ");
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        
    }
    
}
