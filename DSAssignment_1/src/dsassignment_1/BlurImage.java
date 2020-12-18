
package dsassignment_1;


public class BlurImage {
    
    public static double[][] blur_image(double[][] matrix){
       
       double[][] matrix1 = new double[matrix.length][matrix[0].length];
       
       for(int i=0 ;i<matrix.length;i++){
           for(int j=0 ; j<matrix[i].length; j++){
               if(i==0 && j==0){
                   matrix1[i][j] = (matrix[i][j]+matrix[i+1][j]+matrix[i][j+1])/3;
               }
               else if(i==0 && j==(matrix[0].length-1)){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j-1]+matrix[i+1][j])/3;
               }
               else if(i==0 && !(j==0 && j==(matrix[0].length-1))){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j-1]+matrix[i][j+1]+matrix[i+1][j])/4;
               }
               else if(j==0 && i==(matrix.length-1)){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j+1]+matrix[i-1][j])/3;
               }
               else if(j==0 && !(i==0 && j==(matrix.length-1))){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i-1][j])/4;
               }
               else if(i==(matrix.length-1) && j==(matrix[0].length-1)){
                   matrix1[i][j] = (matrix[i][j] + matrix[i][j-1] + matrix[i-1][j])/3;
               }
               else if(i==(matrix.length-1)&&!(j==0&&j==(matrix[0].length-1))){
                   matrix1[i][j] = (matrix[i][j] + matrix[i-1][j]+matrix[i][j-1]+matrix[i][j+1])/4;
               }
               else if(j==(matrix[0].length-1)&&!(i==0&&i==(matrix.length-1))){
                   matrix1[i][j] = (matrix[i][j] + matrix[i-1][j]+matrix[i+1][j] + matrix[i][j-1])/4;
               }
               else{
                   matrix1[i][j] = (matrix[i][j] + matrix[i+1][j] + matrix[i-1][j] +matrix[i][j+1] +matrix[i][j-1])/5;
               }
           }
       }
       return matrix1;
   }
}
