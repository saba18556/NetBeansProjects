
package dsassignment_1;

public class Matrix_Transpose {
    
    public static int[][] transpose(int[][] matrix){
       
       int row = matrix.length;
       int col = matrix[0].length;
       int[][] matrix2 = new int[col][row];
       
       for(int i=0; i<col; i++){
           for(int j=0; j<row; j++){
               matrix2[i][j] = matrix[j][i];
           }
       }
       return matrix2;
       
   }
}
