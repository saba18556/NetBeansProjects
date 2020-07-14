
package mars;

import java.util.Scanner;


public class Mars {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message that is to be sent");
        String str1 = in.next();
        System.out.println("Enter the message that is recieved");
        String str2 =in.next();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int count=0;
        
        for(int i=0;i<str1.length();i++){
            if(s1[i]!=s2[i]){
                count++;
            }
            
        }
        System.out.println("The errors are " + count );
    }
    
}
