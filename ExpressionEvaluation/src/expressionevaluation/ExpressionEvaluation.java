
package expressionevaluation;

class Stack2{
    
    int max;
    int top;
    int[] arr;;
    
    boolean IsEmpty(){
        return(top<0);
    }
    
    Stack2(int n){
       
        this.top = -1;
        this.max = n;
       this.arr = new int[max];
    }
    
    public boolean push(int x) 
	{ 
		if (top >= max){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			top++; arr[top] = x;  
			//System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 
       
       public int pop(){
           
           if(top<0){
               System.out.println("Stack Underflow");
               return -1;
           }
           else{
               int x = arr[top--]; 
            return x;
           }
       }
       
       public int peek(){
           return arr[top];
       }
       
       
       
}

class Stack1{
    
    int max;
    int top;
    String[] arr;;
    
    boolean IsEmpty(){
        return(top<0);
    }
    
    Stack1(int n){
       
        this.top = -1;
        this.max = n;
       this.arr = new String[max];
    }
    
    public boolean push(String x) 
	{ 
		if (top >= max){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			top++; arr[top] = x;  
			//System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 
       
       public String pop(){
           
           if(top<0){
//               System.out.println("Stack Underflow");
               return "Stack Underflow";
           }
           else{
               String x = arr[top--]; 
            return x;
           }
       }
       
       public String peek(){
           return arr[top];
       }
       
       
       
}



public class ExpressionEvaluation {
    
    public static int evaluate(String op, int val1, int val2){
           
           int result;
        switch (op) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            default:
                result = val1 / val2;
                break;                
        }
        return result;
       }
       
    
    public static int Expression_Evaluation(String expression){
           
           String[] list = expression.split(" ");
           Stack2 values = new Stack2(list.length);
           Stack1 operators = new Stack1(list.length);
//           int result = 0;
           
           
           for(int i=0;i<list.length;i++){
               if(list[i].equals("(")){
                   operators.push(list[i]);
               }
               else if(list[i].charAt(0)=='0'|| list[i].charAt(0)=='1'|| list[i].charAt(0)=='2'|| list[i].charAt(0)=='3'|| list[i].charAt(0)=='4'|| list[i].charAt(0)=='5'|| list[i].charAt(0)=='6'|| list[i].charAt(0)=='7'|| list[i].charAt(0)=='8'||list[i].charAt(0)=='9'){
                   values.push(Integer.parseInt(list[i]));
               }
               else if(list[i].equals("+")|| list[i].equals("-")|| list[i].equals("*")|| list[i].equals("/")){
                   operators.push(list[i]);
               }
               else{
                  
                   if(list[i].equals(")")){
                     if(operators.peek().equals("+")|| operators.peek().equals("-")|| operators.peek().equals("*")|| operators.peek().equals("/")){
                         values.push(evaluate(operators.pop(),values.pop(),values.pop()));
                         operators.pop();
                     }
                     
                   }
               
               }
           }
           
           return values.pop();
       }

    
    public static void main(String[] args) {
        
        System.out.println(Expression_Evaluation(" ( 12 / 6 ) "));
        
    }
    
}
