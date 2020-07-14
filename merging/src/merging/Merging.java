
package merging;
import java.util.Scanner;

public class Merging {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the sizes for three arrays= ");
        int size1= in.nextInt();
        int size2= in.nextInt();
        int size3= in.nextInt();
        
        double[] list1= new double[size1];
        double[] list2= new double[size2];
        double[] list3= new double[size3];
        double[] list= new double[list1.length+list2.length+list3.length];
        
        int n;
        System.out.println("Enter the values for first array= ");
        for (n=0;n<list1.length;n++){
            list1[n]=in.nextDouble();
        }
        System.out.println("Enter the values for second array= ");
        for (n=0;n<list2.length;n++){
            list2[n]=in.nextDouble();
        }
        System.out.println("Enter the values for third array= ");
        for (n=0;n<list3.length;n++){
            list3[n]= in.nextDouble();
        }
        int i;
        for (i=0;i<list1.length;i++){
            list[i]=list1[i];
        }
        int j;
        for (i=list1.length,j=0;j<list2.length;i++,j++){
           
            list[i]=list2[j];
        }
        int k;
        for (i=list1.length+list2.length,k=0;k<list3.length;i++,k++){
            
            list[i]=list3[k];
        }
        System.out.println("The array will be= ");
        for (n=0;n<list.length;n++){
            System.out.println( list[n]);
        }
    }
    
}
