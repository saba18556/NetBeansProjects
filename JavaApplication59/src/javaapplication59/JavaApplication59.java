package javaapplication59;

import java.util.Scanner;


public class JavaApplication59 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your password");
        String password=in.next();
        String numbers="0123456789";
        String low= "abcdefghijklmnopqrstuvwxyz";
        String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*()-+";
        
        char[] str = password.toCharArray();
        char[] a = numbers.toCharArray();
        char[] b = low.toCharArray();
        char[] c = up.toCharArray();
        char[] d = special.toCharArray();
        
        int count1=0, count2=0, count3=0, count4=0;
        for(int i=0;i<str.length;i++){
            for (int j=0;j<a.length;j++){
                if(str[i]==a[j]){
                    count1++;
                }
            }
            for (int k=0;k<b.length;k++){
                if(str[i]==b[k]){
                    count2++;
                }
            }
            for (int l=0;l<c.length;l++){
                if(str[i]==c[l]){
                    count3++;
                }
            }
            for(int g=0;g<d.length;g++){
                if(str[i]==d[g]){
                    count4++;
                }
            }
        }
        
        if (count1>=1&&count2>=1&&count3>=1&&count4>=1){
             System.out.println("true");
    }
        else
            System.out.println("false");
        if(str.length<=3){
            System.out.println("You need to add more characters in your password");
        }
            
    
}
}
