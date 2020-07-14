
package mergensort;
import java.util.Scanner;

public class MergeNsort {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a size for array_1: ");
        int size1= in.nextInt();
        System.out.println("Enter a size for array_2: ");
        int size2= in.nextInt();
        int [] list1 = new int[size1];
        int [] list2 = new int[size2];
        int [] list3 = new int[list1.length+list2.length];
        
        int i,j,temp1,temp2;
        
         System.out.println("Enter the values for array_1: ");
        for (i=0;i<list1.length;i++){
            list1[i]=in.nextInt();
        }
        System.out.println("Enter the values for array_2: ");
        for (i=0;i<list2.length;i++){
            list2[i]=in.nextInt();
        }
        
        for (i=0;i<list1.length;i++){
            for (j=0;j<list2.length;j++){
                if (list1[i]>list2[j]){
                 temp1 = list1[i];
                 list1[i]=list2[j];
                 list2[j]=temp1;
                }
            }
            list3[i]=list1[i];
        }
         for (j=0;j<list2.length-1;j++){
             if (list2[j]>list2[j+1]){
                 temp2 = list2[j];
                 list2[j]=list2[j+1];
                 list2[j+1]=temp2;
             }
             list3[i]=list2[j];
             i++;
             } 
         list3[i]=list2[list2.length-1];
        System.out.println("The merged and sorted array will be= ");
        for (i=0;i<list3.length;i++){
            System.out.println(list3[i]);
        }
                
    }
    
}
