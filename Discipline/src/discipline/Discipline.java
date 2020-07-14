package discipline;

import java.util.Scanner;

public class Discipline {
    public static String professor(int k, int[] arr){
         int count=0;
            for (int i=0; i<arr.length;i++){
                if(arr[i]<=0)
                    count++;
            }
            if(count>=k)
            return ("NO");
            else
                return ("YES");
    }
    public static void main (String[] args){


    
        Scanner in = new Scanner ( System.in);
        int cases = in.nextInt();
        
        for (int i=0;i<cases;i++){
            int std= in.nextInt();
            int threshold = in.nextInt();
            int[] arr = new int[std];
            for(int j=0;j<std;j++){
                arr[j]=in.nextInt();
            }
            System.out.println(professor(threshold,arr));
        }
        
    }
}
    
    
    

