
package reversing;

import java.util.Scanner;

public class Reversing {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("State the size of your list: ");
        
        int size = in.nextInt();
        
        int[] list = new int[size];
        
        System.out.println("Enter values for the list:");
        for(int i=0; i<list.length; i++){
            list[i] = in.nextInt();
        }
        int num =list.length ;
        int temp = 0;
        
            
            
             for(int i=0; i<num/2; i++){
                 temp = list[i];
                 list[i] = list[num-i -1];
                 list[num- i -1] = temp;
                         
            
        }
        
        System.out.println("The swapped array will be:");
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
        
        
       
    }
    
}
