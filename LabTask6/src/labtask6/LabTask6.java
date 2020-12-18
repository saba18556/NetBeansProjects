
package labtask6;

import java.util.ArrayList;


public class LabTask6 {
    
   public static class linklist{
       
       int max;
       int top;
       char[] ch;
       
       
       boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       linklist(int n) 
	{ 
		top = -1;
                max = n;
		ch = new char[max];
	} 
       
       public boolean list_push(char x) 
	{ 
		if (top >= max){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			top++; ch[top] = x;  
			//System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 
       
       public char list_pop(){
           
           if(top<0){
               System.out.println("Stack Underflow");
               return 0;
           }
           else{
               char x = ch[top--]; 
            return x;
           }
       }

    
    
   }
    public static String string_reversal(String a){
            
         int n = a.length();
            linklist arr = new linklist(n);
            for(int i=0; i<a.length(); i++){
                arr.list_push(a.charAt(i));
            }
            String result = new String();
            for(int i=0; i<a.length();i++){
                 char ch =arr.list_pop();
              result+=Character.toString(ch);
            }
           return result;
        }
    
    public static void check_braces(String s){
        
        int len = s.length();
        linklist l = new linklist(len);
        ArrayList<Character> li = new ArrayList <Character>(1);
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='{'){
                l.list_push(s.charAt(i));
            }
            else if((s.charAt(i)!= '{')&& (s.charAt(i)!= '}')){
                li.add(s.charAt(i));
            }
            else{
                l.list_pop();
            }
        }
        if(l.isEmpty()){
            System.out.println("All braces are closed correctly");
        }
        else{
            System.out.println("Braces are not closed correctly");
        }
        
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Q1:");
        System.out.println(string_reversal("String"));
        
        System.out.println("-------------------------------");
        System.out.println("Q2: ");
//        check_braces("if(l.isEmpty()){\n" +
//"            System.out.println(\"All braces are closed correctly\");\n" +
//"        }\n" +
//"        else{\n" +
//"            System.out.println(\"Braces are not closed correctly\");\n" +
//"        }");
//        check_braces("if(l.isEmpty()){\n" +
//"            System.out.println(\"All braces are closed correctly\");\n" +
//"        }\n" +
//"        else{\n" +
//"            System.out.println(\"Braces are not closed correctly\");");
        
        check_braces("}{}");
    }
    
}
