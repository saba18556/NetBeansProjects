
package magicmatrix;

import java.util.Scanner;

public class MagicMatrix {
    
    public static int[][] readSquare(){
        
         Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the size of square: ");
        
        int var = in.nextInt();
        
        int[][] matrix = new int[var][var];
        
        System.out.println("Enter the values for square:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
         
    }
    
  
        public static int sumRow(int row, int[][] matrix){
        int sum_of_row =0;
         for(int i=0; i<matrix.length; i++){
            
                sum_of_row = sum_of_row + matrix[row][i];
            
        }
         return sum_of_row;
        
    }
    
    public static int sumColumn(int column,int[][] matrix){
        int sum_of_column =0;
         for(int i=0; i<matrix.length; i++){
            
                sum_of_column = sum_of_column + matrix[i][column];
            
        }
         return sum_of_column;
        
    }
    
    public static int sumMainDiagnol(int[][] matrix){
        int sum_of_diagnol =0;
         for(int j=0; j<matrix.length; j++){
            for(int i=0; i<matrix[j].length; i++){
                if(i==j){
                sum_of_diagnol = sum_of_diagnol + matrix[j][i];
                }
            }
        }
         return sum_of_diagnol;
        
    }
    
    public static int sumOtherDiagnol(int[][] matrix){
        int sum_of_other = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if((i+j)==(matrix.length -1)){
                sum_of_other = sum_of_other + matrix[i][j];
                }
            }
        }
        return sum_of_other;
    }
    public static boolean magic(int[][] matrix){
        
         boolean magic = true;
        
        int[] rowArray = new int[matrix.length];
        for(int i=0; i<matrix.length; i++){
            rowArray[i] = sumRow(i, matrix);
        }
        
        int[] columnArray = new int[matrix.length];
        for(int i=0; i<matrix.length; i++){
            columnArray[i] = sumColumn(i, matrix);
        }
        
        boolean row = true;
        boolean col = true;
        
        for(int i=0; i<rowArray.length-1; i++){
            if(rowArray[i]!=rowArray[i+1]){
                row = false;
                break;
            }
        }
        
        for(int i=0; i<columnArray.length-1; i++){
            if(columnArray[i]!=columnArray[i+1]){
                col = false;
                break;
            }
        }
        
        boolean diagnols = true;
        
        if(sumMainDiagnol(matrix)!=sumOtherDiagnol(matrix)){
            diagnols = false;
        }
        
       
        
        if(row && col && rowArray[0]==columnArray[0] && diagnols){
            magic = true;
            
        }
        else{
            magic = false;
        }
        
        return magic;
    }

   

    public static void main(String[] args) {
        
       int[][] list =readSquare();
       boolean flag = magic(list);
       if(flag==true){
           System.out.println("Yes this is a magic square");
       }
       else{
           System.out.println("No this is not a magic square");
       }
       
        
    }
    
}
