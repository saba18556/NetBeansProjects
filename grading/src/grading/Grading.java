
package grading;

import java.util.Scanner;


public class Grading {

    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        do{
        System.out.println("How many questions are in the quiz? ");
        int questions = in.nextInt();
        
        int[] quiz_arr = new int[questions];
        
        System.out.println("Enter the key for quiz:");
        
        for(int i=0 ; i< quiz_arr.length; i++){
           quiz_arr[i] = in.nextInt(); 
        }
        
        System.out.println("Enter your answers:");
        
        int ans = 0;
        int sum = 0;
        
        for(int i =0; i<quiz_arr.length; i++){
            ans = in.nextInt();
            if(quiz_arr[i]== ans){
                sum++;
            }
        }
        System.out.println("The total score will be: " + sum);
        
            System.out.println("Would you like to grade another quiz?(Y/N)");
            String response = in.next();
            if(response.equals("Y")){
                flag = true;
            }
            else{
                flag = false;
            }
    }while(flag);
        }

}
