package javaapplication57;
import java.util.Scanner;
public class JavaApplication57 {

    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a word with spaces in between");
         String s1=in.next();
         String[] s =s1.split("[ ]");
         int n = s1.length();
         String temp=s[0];
         for (int i=0;i<s1.length()/2;i++){
                 temp=s[i];
                 s[i]=s[n];
                 s[n]=temp;
                 n--;
            }
             
                 
         
         for(int i=0;i<s1.length();i++){
             System.out.println(s[i]);
         }
         
         
    }
    
}
