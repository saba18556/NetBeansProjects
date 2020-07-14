
package gameit;
import java.util.Scanner;

public class Gameit {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int number1 = (int)(Math.random()*3);
        
        
        //prompt input from user
        System.out.println("Enter a rock(0), paper(1) or scissors(2)= ");
        char number2 = in.next().charAt(0);
        
       switch(number2){
           case'0':
       if (number1==0)
       System.out.println("Computer and you are rock. The game is DRAW");
       else if (number1==1)
            System.out.println("Computer is paper. you are rock. you lost.'SORRY!'");
        else if(number1==2)
            System.out.println("Computer is scissors. you are rock. you won. 'CONGRATULATIONS!'");
        break;
           case '1':
         if (number1==0)
        System.out.println("Computer is rock. you are paper. you won. 'CONGRATULATIONS!'");
        else if (number1==1)
            System.out.println("Computer is paper. you are paper.The game is DRAW.");
        else if (number1==2)
            System.out.println("Computer is scissors. you are paper.you lost.'SORRY!'");
        break;
           case '2':
         if (number1==0)
         System.out.println("Computer is rock. you are scissors. you lost.'SORRY!'");
        else if (number1==1)
          System.out.println("Computer is paper. you are scissors.you won.'CONGRATULATIONS!'");
        else if (number1==2)
            System.out.println("Computer is scissors. you are scissors. The game is DRAW");
        break;
       }
    }
    
}
