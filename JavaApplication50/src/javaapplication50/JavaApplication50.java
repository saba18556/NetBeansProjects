
package javaapplication50;
import java.util.Scanner;

public class JavaApplication50 {

    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Line input is: ");
        String s=in.nextLine();
        
        System.out.println("Select option:");
        System.out.println("Choose 1 to replace all");
        System.out.println("choose 2 to replace one at a time");
        System.out.println("choose 3 to count number of sentences");
        System.out.println("choose 4 to count number of words");
        System.out.println("choose 5 to count articles");
        System.out.println("choose 6 to count spaces");
        char ch = in.next().charAt(0);
        switch (ch){
            
         case'1':{
             Scanner scan=new Scanner(System.in);
            System.out.print("Enter word/letter to replaceAll:");
        String a=scan.nextLine();
        System.out.print("Enter word/letter with which to replaceAll:");
        String b=scan.nextLine();
        String str=s.replace(a,b);
        System.out.println("Replaced string:");
        System.out.println(str);
       
        }break;
        
        case'2':{
            Scanner input=new Scanner(System.in);
        System.out.print("Enter word/letter to replaceFirst:");
        String c=input.nextLine();
        System.out.print("Enter word/letter with which to replaceFirst:");
        String d=input.nextLine();
        String str1=s.replaceFirst(c,d);
        System.out.println("Replaced string:");
        System.out.println(str1);
        
        }break;
        
       
        
        case'3':{
        System.out.print("No. of sentences:");
        String[] sent= s.split("[.?]");
        System.out.println(sent.length);
        }break;
        
        
        case'4':{
        System.out.print("No. of words:");
        String[] word= s.split("[ ]");
        System.out.println(word.length);
        }break;
        
        
        case'5':{
        System.out.print("No. of articles:");
        String[] str2= s.split("[ ]",0);
        int count=0;
        for (int i=0; i<str2.length; i++){
            if ((str2[i]).equals("a")||(str2[i]).equals("an")||(str2[i]).equals("the")){
                count++;
            }
           }
        System.out.println(count);
        }break;
        
        
        case'6':{
        System.out.print("No. of spaces:");
        String[] spaces= s.split("[ ]");
        System.out.println(spaces.length-1);
}
        break;
        
    }
    }
    
        
        
        
        
        
        

 
   
    
}

    
    

