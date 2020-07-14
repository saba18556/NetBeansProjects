
package javaapplication38;
import java.util.Scanner;

public class JavaApplication38 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of students= ");
        int size = in.nextInt();
        int[] list = new int[size];
        
        int i,j;
        int best=0;
        System.out.println("Enter the scores of "+size+" students= ");
        for (i=0;i<list.length;i++){
            list [i]=in.nextInt();
        }
        for (i=0;i<list.length;i++){
            for (j=i+1;j<list.length-1;j++){
                if (list[i]>list[j]){
                    best = list[i];
                }
                else
                    best = list[j];
            }
        }
        int a= best-10;
        int b= best-20;
        int c= best-30;
        int d= best-40;
        for (i=0;i<list.length;i++){
            if (list[i]>=a){
                System.out.println("student "+(i+1)+" score is "+list[i]+" and grade is A");
            }
            else if (list[i]>=b){
                System.out.println("student "+(i+1)+" score is "+list[i]+" and grade is B");
            }
            else if (list[i]>=c){
                System.out.println("student "+(i+1)+" score is "+list[i]+" and grade is C");
            }
            else if (list[i]>=d){
                System.out.println("student "+(i+1)+" score is "+list[i]+" and grade is D");
            }
            else
                System.out.println("student "+(i+1)+" score is "+list[i]+" and grade is F");
        }
    }
    
}
