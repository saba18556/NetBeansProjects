
package labtask2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LabTask2 {
    
   
    
    public static int linearSearch(int[] list, int num){
        
        int result = 0;
        
        for(int i=0; i<list.length; i++){
            if(list[i]== num){
                result = i;
                break;
            }
            else{
                result = -1;
            }
        }
        return result;
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
    
    public static int[] duplicate(int[] list){
        
         int  num = list.length;
        
        
        for(int i=0; i<num;i++){
            for(int j=i+1; j<num; j++){
                if(list[i]==list[j]){
                    list[j]=list[num-1];
                    num--;
                    j--;
                }
                
            }
           
        }
        
        int[] new_array = Arrays.copyOf(list, num);
        Arrays.sort(new_array);
        
        return (new_array);
        
    }
    
    public static void calculation(){
         Scanner in = new Scanner(System.in);
       
       
        System.out.print("Enter the size of array: ");  
        int size = 0;
       
        while(true){
        try{
            
           String input = in.next();
         size = Integer.parseInt(input);
        break;
        }
        catch(Exception ex){
            System.out.print("Enter an Integer value: ");
            in.reset();
        }}
        
        System.out.println("Enter the value to be found: ");
        int key = in.nextInt();
        int[] list1 = new int[size];
        
        for (int i = 0; i < list1.length; i++) {
            list1[i] = (int) (Math.random() * 100) + 1;
        }
        
         duplicate(list1);
       
        
      
       boolean flag = true;
       long startTime = System.nanoTime();
       
       for (int i = 0; i < list1.length; i++) {
            if (list1[i] == key) {
                System.out.println(key + " found at index " + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            
            System.out.println("Not Found");
            
        }
      long endTime = System.nanoTime();
      
     
      System.out.println("Time taken by Linear Search: "+ (endTime - startTime));
        
        long t1 = System.nanoTime();
        int y =binarySearch(list1, key);
        long t2 = System.nanoTime();
        
        
        if (y <= 0) {
            System.out.println("not found");
        } else {
            System.out.println(key + " found at index " + y);
        }
        System.out.println("Time taken by Binary Search: "+ (t2 - t1));
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
           System.out.println("");
        
             
    }

    public static void main(String[] args) {
        
       calculation();
    }
    
}
