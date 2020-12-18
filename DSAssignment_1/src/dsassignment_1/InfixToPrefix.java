
package dsassignment_1;


public class InfixToPrefix {
    
    public static String reverseIt(String input){
       
       byte[] str = input.getBytes();
 
        byte[] result = new byte[str.length];
 
        
        for (int i = 0; i < str.length; i++)
            result[i] = str[str.length - i - 1];
 
        return (new String(result));
       
   }
   
  
    
    public static int precedenceOf(char C) { 
    if (C == '-' || C == '+'){ 
        return 1; 
    }
    else if (C == '*' || C == '/') {
        return 2; 
    }
    else{
    return 0; 
    }
} 
   
 public static String infix_to_prefix(String str) { 
    
    Stack operators = new Stack(str.length()); 
   
    Stack1 operands = new Stack1(str.length());
  
    for (int i = 0; i < str.length(); i++){
        
        char c = str.charAt(i);
        
        if(c==' '){
            continue;
        }
   
        else if (c == '(')  { 
            operators.push(str.charAt(i)); 
        } 
  
        else if (c == ')')  { 
            while (!operators.isEmpty() &&  operators.peek() != '(')  { 
                String a = operands.pop() + operands.pop()+ operators.pop(); 
                operands.push(a);
            } 
  
            operators.pop(); 
        }
        else if (Character.isDigit(c) || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))  { 
            operands.push(Character.toString(c)); 
        } 
        
        else { 
            while (!operators.isEmpty() &&  precedenceOf(c) <=  precedenceOf(operators.peek()))  { 
                String a = operands.pop() + operands.pop()+ operators.pop(); 
                operands.push(a); 
            } 
            operators.push(c); 
        } 
    } 
  
    while (!operators.isEmpty())  { 
        String a = reverseIt(operands.pop() + operands.pop()+ operators.pop()); 
        operands.push(a);
    } 
   
    return operands.peek(); 
} 
}
