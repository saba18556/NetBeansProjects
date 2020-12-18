import java.util.*;

public class LinkedListBuiltinDemo {
    
    public static void main(String[] args) {
        
        LinkedList<String> linkedlist = new LinkedList<String>();
        
        linkedlist.add("Item1");
	linkedlist.add("Item5");
	linkedlist.add("Item3");
	linkedlist.add("Item6");
	linkedlist.add("Item2");
				
	/*Add First and Last Element*/
	linkedlist.addFirst("First Item");
	linkedlist.addLast("Last Item");
				
	// print list
	System.out.println(linkedlist);
		
	/*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
	Object firstvar2 = linkedlist.get(0);
	System.out.println("First element after update by set method: " +firstvar2);
				
	/*Remove first and last element*/
	linkedlist.removeFirst();
	linkedlist.removeLast();
	System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

	System.out.println("Size of the linked list: "+linkedlist.size());
	System.out.println("Is LinkedList empty? "+linkedlist.isEmpty());
	System.out.println("Does LinkedList contains 'Item6'? "+linkedlist.contains("Item6"));

	// Demonstration of ListIterator
        ListIterator<String> li= linkedlist.listIterator() ;
        
	// moving forward
        while (li.hasNext()) {
            
	    System.out.println(li.next());            
        
        }   
        
        while (li.hasPrevious()) {
            
            System.out.println(li.previous());
        
        }
    }
    
}
