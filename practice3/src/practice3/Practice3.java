
package practice3;

import java.util.Scanner;


public class Practice3 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int[][] a = new int[4][7];
        System.out.println("Enter values in tha array");
        for(int i=2;i<4;i++){
            for (int j=0;j<7;j++){
                a[i][j]=j;
            }
            
        }
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
                
    }
    
}
