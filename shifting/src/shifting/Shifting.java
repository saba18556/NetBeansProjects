
package shifting;
import java.util.Scanner;

public class Shifting {

    
    public static void main(String[] args) {
       
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of array= ");
        int size=in.nextInt();
        int[] list=new int[size];
        
        int n;
        System.out.println("Enter the values for array= ");
        for (n=0;n<list.length;n++){
            list[n]=in.nextInt();
        }
        
        int i,temp=list[0];
        for(i=1;i<list.length;i++){
            list[i-1]=list[i];
        }
        list[list.length-1]=temp;
        
        System.out.println("The shifted array will be= ");
        for(n=0;n<list.length;n++)
            System.out.println(list[n]);
            
        
    }
    
}
