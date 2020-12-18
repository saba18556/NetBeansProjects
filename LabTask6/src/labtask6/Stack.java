
package labtask6;


public class Stack {
    
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
