package sockmarket;

import java.util.*;


public class SockMArket {

    public static void main(String[] args) {
        
          Scanner in= new Scanner (System.in);
        System.out.println("Enter the size of array");
        int size= in.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }
        Arrays.sort(arr);
        int pair=0;
        for(int i=0; i<size-1; i++){
            if(arr[i]==arr[i+1]){
                pair++;
                i=i+1;
            }
        }
        System.out.println("The pairs are"+pair);
        
    }

    }
    

