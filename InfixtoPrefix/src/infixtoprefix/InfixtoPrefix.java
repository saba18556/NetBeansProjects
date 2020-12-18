
package infixtoprefix;



class Stack{
    int max;
    int top;
    char[] ch;
    
    boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       Stack(int n) 
	{ 
		top = -1;
                max = n;
		ch = new char[max];
	} 
       
       public boolean push(char x) 
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
       
       public char pop(){
           
           if(top<0){
               System.out.println("Stack Underflow");
               return 0;
           }
           else{
               char x = ch[top--]; 
            return x;
           }
       }
       
       public char peek(){
           return ch[top];
       }
    
}

class Stack1{
    int max;
    int top;
    String[] ch;
    
    boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       Stack1(int n) 
	{ 
		top = -1;
                max = n;
		ch = new String[max];
	} 
       
       public boolean push(String x) 
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
       
       public String pop(){
           
           if(top<0){
               return "Stack Underflow exception";
           }
           else{
               String x = ch[top--]; 
            return x;
           }
       }
       
       public String peek(){
           return ch[top];
       }
    
}

 public class InfixtoPrefix {
    public static String reverseIt(String input){
       
       byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        return (new String(result));
       
   }
    
    
    
    public static String infix_to_prefix(String exp){
//       
//       Stack s = new Stack(exp.length());
////       StringBuilder sdf = new StringBuilder(exp);
//       String str = reverseIt(exp);
//       StringBuilder sbf = new StringBuilder(exp.length()); 
//       
//       for(int i=0; i<str.length();i++){
//           
//           char c = str.charAt(i); 
//           if(c ==' '){      
//               continue;
//           }
//           else if(Character.isDigit(c)){  
//               sbf.append(Character.toString(c));   
//           }
//           else if(c == '(' || c == '+' || c == '-' || c == '*' || c == '/'){  
//               s.push(c);                      
//           }
//           else{
//               if(c == ')'){   
//               if(s.peek()== '+' || s.peek() == '-' || s.peek() == '*' || s.peek() == '/'){ 
//                   sbf.append(Character.toString(s.pop()));  
//                   s.pop();                              
//               }
//               }
//               else{
//                   sbf.append(Character.toString(c));  
//               }
//               
//           }
//       }
//       String result = sbf.reverse().toString();  
//       
//       return result;
//   } 

    
    public static void main(String[] args) {
        
        System.out.println( infix_to_prefix("(A-B/C)*(A/K-L)")); 
        System.out.println( infix_to_prefix("(A-(B/C))*((A/C)-B)")); 
        
    }
    
}
