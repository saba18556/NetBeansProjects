
package javaapplication37;
import java.util.Scanner;

public class JavaApplication37 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the row for matrix1= ");
        int r1= in.nextInt();
        System.out.println("Enter the column for matrix1= ");
        int c1= in.nextInt();
        int [][] matrix1= new int[r1][c1];
        System.out.println("Enter the row for matrix2= ");
        int r2= in.nextInt();
        System.out.println("Enter the column for matrix2= ");
        int c2= in.nextInt();
        int [][] matrix2= new int[r2][c2];
        int [][] matrix3= new int[r1][r2];
        int i,j,z;
        
        for (i=0;i<matrix1.length;i++)
            for (j=0;j<matrix1[i].length;j++)
                matrix1[i][j]=(int)(Math.random()*10);
       
        System.out.println("Matrix1: ");
        for (i=0;i<matrix1.length;i++){
            for (j=0;j<matrix1[i].length;j++)
                System.out.print(matrix1[i][j] + " ");
            System.out.println();
        }
        for (i=0;i<matrix2.length;i++)
            for (j=0;j<matrix2[i].length;j++)
                matrix2[i][j]=(int)(Math.random()*10);
        
        System.out.println("Matrix2: ");
        for (i=0;i<matrix2.length;i++){
            for (j=0;j<matrix2[i].length;j++)
                System.out.print(matrix2[i][j] + " ");
            System.out.println();
        }
        for (i=0;i<matrix3.length;i++)
            for (j=0;j<matrix3[i].length;j++)
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
        
        if ((r1==r2)&&(c1==c2)){
        System.out.println("Matrix3 after addition: ");
        for (i=0;i<matrix3.length;i++){
            for (j=0;j<matrix3[i].length;j++)
                System.out.print(matrix3[i][j] + " ");
            System.out.println();
        }
        
        }
        else{
        System.out.println("not possible");}
        int [][] matrix4 = new int [r1][c2];
        
        int product;
        int sum=0;
        if(c1==r2){
        for (i=0;i<matrix4.length;i++){
            for (j=0;j<matrix4[i].length;j++){
              for (z=0;z<matrix4[i].length;z++){
                  product = matrix1[i][z]*matrix2[z][j];
                  sum = sum+product;
                  //matrix4[i][j] = sum;
              }  
              matrix4[i][j]=sum;
              sum=0;
            }
         }
        System.out.println("Matrix4 after multiplication: ");
        for (i=0;i<matrix4.length;i++){
            for (j=0;j<matrix4[i].length;j++)
                System.out.print(matrix4[i][j] + " ");
            System.out.println();
        }
        }
                
    }
    
}
