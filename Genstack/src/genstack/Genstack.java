
package genstack;

class Stacks<E>{
int max;
    int top;
    ArrayList<E> ch;
    
    boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       Stacks(int n) 
	{ 
		top = -1;
                max = n;
		ch = new ArrayList<E>(n);
	} 
       
       public boolean list_push(E x) 
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
       
       public E list_pop(){
           
           
           if(top<0){
               System.out.println("Stack Underflow");
               return "Stack Underflow";
           }
           else{
               E x = ch[top--]; 
            return x;
           }
       }
}


public class Genstack {
    
    public static E sum(Stack<E> st){
        while(!st.empty()){
            
        }
    }

    
    public static void main(String[] args) {
        
    }
    
}
