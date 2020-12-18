
public class StackAsArray {
    
    static final int MAX = 1000; 
	int top; 
	int a[]= new int[MAX];
        
   
	boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
	StackAsArray() 
	{ 
		top = -1;
		for (int i=0;i<MAX;i++)
			a[i]=0;
	} 

	public boolean push(int x) 
	{ 
		if (top >= (MAX - 1)){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			top++; a[top] = x;  
			System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 

	public void pop() 
	{ 
		if (top < 0)  
			System.out.println("Stack Underflow"); 
		else { 
			System.out.println(a[top]+" is popped from stack");
                        // return a[top];
			a[top]=0;
			top--;
			System.out.println("Now the top is "+ top);
                        
		} 
	} 
        
       

	public int peek() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top]; 
			return x; 
		} 
} 
        public static String string_reversal(String a){
            
            StackAsArray arr = new StackAsArray();
            for(int i=0; i<a.length(); i++){
                arr.push(a.charAt(i));
            }
            String result = null;
            for(int i=0; i<a.length();i++){
                //result+= arr.pop();
            }
            return "a";
        }

// Driver code 
	public static void main(String args[]) 
	{ 
		StackAsArray s = new StackAsArray(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		s.pop();
		System.out.println(s.peek() + " is on the top of the stack"); 
	} 
    
}
