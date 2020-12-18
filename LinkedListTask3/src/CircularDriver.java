
public class CircularDriver {
    
    
    
    
    public static void main (String[] args){
        
       CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        
        list.insert(1);  // Values are inserted in LIFO fashion 
        list.insert(3);
        list.insert(123);
        list.insert(4);
        list.insert(5);
        list.IterateForward(); 
        System.out.println("The data in the provided index: " + list.get(2));
        list.remove(1);
        list.remove(123);
        list.remove(5);
        list.IterateBackward();
        System.out.println("Is the list Circular? " +list.Check_Circular());
        System.out.println("The data in the provided index: " + list.get(5));
        System.out.println("The data in the provided index: " + list.get(1));
        
        
        
        
    }
    
}
