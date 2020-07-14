/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;
import java.util.Scanner;
/**
 *
 * @author Saba fatima
 */
public class Sudoku {
    public static void main(String[] args) {
      
        Scanner in = new Scanner (System.in);
        int[][] sudoku = 
        {{5, 3, 0, 0, 7, 0, 0, 0 ,0},
         {6, 0, 0, 1, 9, 5, 0, 0, 0},
         {0, 9, 8, 0, 0, 0, 0, 6, 0},
         {8, 0, 0, 0, 6, 0, 0, 0, 3},
         {4, 0, 0, 8, 0, 3, 0, 0, 1},
         {7, 0, 0, 0, 2, 0, 0, 0, 6},
         {0, 6, 0, 0, 0, 0, 0, 0, 0},
         {0, 0, 0, 4, 1, 9, 0, 0, 5},
         {0, 0, 0, 0, 8, 0, 0, 7, 9}};
        
        int i,j,l;
        for (i=0;i<sudoku.length;i++){
            for(j=0;j<sudoku[i].length;j++)
        System.out.print(sudoku[i][j]+ " ");
            System.out.println();
        }
        for (i=0;i<sudoku.length;i++){ 
            for (j=0;j<sudoku[i].length;j++){
                if (sudoku[i][j]==0){
                    System.out.println("Enter the value for block with row "+i+" and column "+j);
                    sudoku[i][j]=in.nextInt();
                }
            }
        }
        
                     boolean valid =true;
        System.out.println("Checking validity along the rows and columns:");
        System.out.println();
            for (i=0;i<sudoku.length;i++){
                for(j = 0; j<sudoku.length; j++) {
                    for(int k = 0; k<sudoku.length; k++) {
                        if(j!=k) {
                            if(sudoku[i][j] == sudoku[i][k]) {
                                System.out.println("The ans is not valid along the rows and column");
                                valid = false;
                                break;
                            }
                     }
                        
                }if(valid==false) break;
            }if(valid==false)
                     break;
         }
            if(valid==true)                                
            System.out.println("All is valid along the rows and columns");
            
             System.out.println("Checking the validity along the grid:");
                    System.out.println();
                    for (i=0;i<9;i+=3){
                        for (j=0;j<9;j+=3){
                            for (int k=0+i;k<3+i;k++){
                                for ( l=0+j;l<3+j;l++){
                                    for (int m=0+i;m<3+i;m++){
                                        for (int n=0+j;n<3+j;n++){
                                            if(k==m && l==n){ 
                                                continue;
                                            }
                                                if (sudoku[k][l]==sudoku[m][n] && sudoku[k][l]==sudoku[k][n]){
                                                    System.out.println("The ans is not valid for the grid");
                                                    valid=false;
                                                    break;
                                                }
                                            }
                                        }
                                        
                                    }
                                    if (valid==false)
                                    break;
                            }
                            if (valid==false)
                             break;
                        }
                    if (valid==true)
                        System.out.println("All is valid for the grid");
                    
        for (i=0;i<sudoku.length;i++){
            for (j=0;j<sudoku[i].length;j++)
                System.out.print(sudoku[i][j]+ " ");
            System.out.println();
        }
      }
        
    }
    
}
