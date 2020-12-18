
package dsassignment_1;

class Stacks1{
    
    int max;
    int top;
    int[] ch;
    
    boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       Stacks1(int n) 
	{ 
		top = -1;
                max = n;
		ch = new int[max];
	} 
       
       public boolean push(int x) 
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
       
       public int pop(){
           
           if(top<0){
               System.out.println("Stack Underflow");
               return 0;
           }
           else{
               int x = ch[top--]; 
            return x;
           }
       }
    
}
//

public class Expression_Evaluation {
    
    public static int evaluate(char op, int val1, int val2){
           
           int result = 0;
        switch (op) {
            case '+':
                result = val2 + val1;
                break;
            case '-':
                result = val2 - val1;
                break;
            case '/':
                result = val2 / val1;
                break;
            case '*':
                result = val2 * val1;
                break;                
        }
        return result;
       }
   public static int postfix_evaluation(String str){
       
       Stacks1 s = new Stacks1(str.length());
       
       for(int i=0; i<str.length(); i++){
           if(Character.isDigit(str.charAt(i))){
               s.push(Integer.parseInt(String.valueOf(str.charAt(i))));
           }
           else{
               s.push(evaluate(str.charAt(i),s.pop(),s.pop()));
           }
       }
       return s.pop();
       
   }
}
