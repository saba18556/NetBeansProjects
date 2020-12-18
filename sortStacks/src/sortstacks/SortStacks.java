
package sortstacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

 

public class SortStacks {
    
    public static Stack sort_stacks(Stack<Integer> a, Stack<Integer> b){
        
        Stack<Integer> c = new Stack();
        
        while(!a.empty()){
            c.push(a.pop());
        }
        while(!b.empty()){
            c.push(b.pop());
        }
        Stack<Integer> stack = new Stack();
        while(!c.empty()){
           int temp = c.pop();
            while(!stack.empty()&&stack.peek()>temp){
                c.push(stack.pop());
            }
            stack.push(temp);
        }
            
        return stack;
        }
    

    
    public static void main(String[] args) {
        
        Stack<Integer> a = new Stack();
        Stack<Integer> b = new Stack();
        
        a.push(16);
        a.push(17);
        a.push(21);
        a.push(23);
        a.push(52);
        a.push(62);
        
        b.push(1);
        b.push(7);
        b.push(20);
        b.push(23);
        b.push(55);
        b.push(92);
        
//        System.out.println(b.pop());
        
        
        Stack c = sort_stacks(a, b);
        while(!c.empty()){
            Integer r = (Integer) c.pop();
            System.out.println(r);
        }
    }
    
}
