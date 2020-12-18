
public class CircularDoublyLinkedList {
    
    private Node head;
    private Node tail;
    private int size;

    public CircularDoublyLinkedList() {
	  head= null;
          tail = null;
	  size=0;
	}
	private class Node {
		 
		Object data;
		Node next;
		Node prev;
		
		public Node( Object data, Node prev, Node next ) {
			this.data=data;
			this.next= next;
			this.prev= prev;
		 }
		} // end of Node class
        
        public boolean isEmpty() { return size == 0; }
	
        
        /**
         *  Insert Method
         */
	public void insert( int data ) {
            
             Node tmp = new Node(data, null, tail);
              
        if(head == null) {
            
           tmp.next = tmp;
           tmp.prev = tmp;
           head = tmp;
           tail = tmp;
        }
        
        else{
            
            tmp.prev = tail;
            tail.next = tmp;
            head.prev = tmp;
            tmp.next = head;
            head = tmp;
        }
        size++;
        
        System.out.println("adding: "+data);
             
	}
        
        /**
         * @Get Node Method
         */
        
        public Node getdata(Object data){
            
            Node temp = head;
        
       
         if(head.data==data){
                return head;
                
            }
        else {
         while(temp.next!=head){
            if(temp.data==data){
                break;
            }
            temp = temp.next;
        }
        }
        return temp;
            
        }
        
        /**
         * @Removing Data
         */
    public void remove( Object data ) {
        
        Node temp = getdata(data);
        
        if(temp == head){
       
        System.out.println("Removing: "+ temp.data);   
        head = head.next;
        head.prev = tail;
        tail.next = head;
        size--;
        }
        
        else if(temp==tail){
             System.out.println("Removing: "+ temp.data);   
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
        }
        else{
             System.out.println("Removing: "+ temp.data);   
        temp.prev.next = temp.next ;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
        size--;
        }
	}
	 public Object get( int index ) {
             
             Node temp = head;
             
             if(isEmpty()==true){ return ("List is empty."); }
             
             for(int i=0; i<size; i++){
                 if(i==index){
                     return temp.data;
                     
                 }
                
                 temp = temp.next;
             }
            return ("Index not found.");
	 
	 }
	 public void IterateForward( ) {
             
             Node temp = head;
             
             System.out.println("Iterating Forward.....");
             if(isEmpty()==true){
               System.out.println("OOPS!!...The list is empty");}
             
             else if(head.next == head){
                 System.out.println(head.data);
             }
             else{
             while(temp.next!=head){
                 System.out.println(temp.data);
                 temp = temp.next;
             }
             System.out.println(tail.data);
             }
             
	 }
         
	 public void IterateBackward( ) {
             
             Node temp = tail;
             
             System.out.println("Iterating Backward.....");
             if(isEmpty()==true){
               System.out.println("OOPS!!...The list is empty");}
             
             else if(tail.prev == tail){
                 System.out.println(tail.data);
             }
             else{
             while(temp.prev != tail){
                 System.out.println(temp.data);
                 temp = temp.prev;
             }
             System.out.println(head.data);
             }
	}

// The method check circular traverses the list and checks if the list is circular. It return true if the list
//	is circular and returns false if list is not circular. 

	 boolean Check_Circular(){
             
             if(isEmpty()==true){
                 return false;
             }
             else if(head.next==head || (head.prev==tail && tail.next==head)){
                 return true;
             }
             
             else{
                 return false;
             }
		 
		}
}

    

