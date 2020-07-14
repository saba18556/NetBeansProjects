
package sorting;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of array= ");
        int size= in.nextInt();
        int[] list= new int[size];
        
        int n;
        for (n=0;n<list.length;n++){
            list[n]=in.nextInt();
        }
        int temp;
        int i;
        
        for (n=0;n<list.length;n++){
            for (i=n+1; i<list.length; i++){
                if (list[n]>list[i]){
                    temp = list[n];
                    list[n] = list[i];
                    list[i] = temp;
                     }
           }
        }
        System.out.println("Sorted array will be= ");
        for (n=0;n<size;n++)
            System.out.print(list[n] + ",");
       
        
                
    }
    
}
