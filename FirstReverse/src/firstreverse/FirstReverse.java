
package firstreverse;

import java.util.Scanner;


public class FirstReverse {
    
     public static  String FReverse(String str1) {
     
         String str2 ="";
         int i;

    for( i=str1.length()-1 ;i>=0;i--){
         
        
          str2 += str1.charAt(i);
        
    }
    
            return(str2);
    
  }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence or word");
        String ans = "hello";
        System.out.println(FReverse(ans));
        
        
        
    }
    
}
