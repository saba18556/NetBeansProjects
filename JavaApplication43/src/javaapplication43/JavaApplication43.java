/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;
import java.util.Scanner;
/**
 *
 * @author Saba fatima
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        int i,j;
        int num=0;
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
        int x=0, y=0;
        num=sudoku[x][y];
        for (i=0;i<sudoku.length;i++){
            while (y<sudoku.length){
                for (j=1;j<sudoku[i].length;j++){
                    if (num==sudoku[i][j])
                        System.out.println("Error at row= "+i+" column= "+j);
                    y++;
                }
            }
            x++;
        }
         for (i=0;i<sudoku.length;i++){
            for (j=0;j<sudoku[i].length;j++)
                System.out.print(sudoku[i][j]+ " ");
            System.out.println();
        }
        
    }
    
}
