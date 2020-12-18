
package linkedlisttask3;


public class SinglyLinkedList {
    
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
        
    //addNode() will add a new node to the list    
    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
        
    //display() will display all the nodes present in the list    
    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.println(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
  
  //addAtStart() will add a new node to the beginning of the list  
    public void addAtStart(int data) {
        
        Node newNode = new Node(data);
           newNode.next = head;
           head = newNode;
        
    }
    
  //addAtEnd() will add a new node to the end of the list  
    public void addAtEnd(int data) { 
        
        Node current = head;
        
        while(current.next!=null){
            current = current.next;
        }
        
        current.next = new Node(data);
    }
   
  //countNodes() will count the nodes present in the list    
    public int countNodes() { 
        
        Node current = head;
        int count =0;
        
        if(head==null){
            return -1;
        }
        
        while(current!=null){
            
            current = current.next;
            count++;
        }
        
        
     return count;
    }
  
    //searchNode() will search for a given node in the list  
    public void searchNode(int data) {  
        
        Node current = head;
        int count = 0;
        boolean flag = false;
        
        if(head == null){
            System.out.println("List is empty");
        }
        
        while(current!=null){
            
            if(current.data==data){
                
                System.out.println("It is present at: "+ count);
                flag = true;
            }
            
            current = current.next;
          count++;     
        }
        if(flag==false){
            System.out.println("Not found");
        }
        
    }
    
  //deleteFromStart() will delete a node from the beginning of the list  
    public void deleteFromStart() {
        if(head==null){
            return;
        }
        
        head = head.next;
    	  
    }
  
    //deleteFromEnd() will delete a node from end of the list  
    public void deleteFromEnd() { 
        
        Node current = head;
        while(current.next.next!= null){
            current = current.next;
            
        }
        current.next = null;
        
    }
    
    /**
     *
     * @param p
     * @param q
     * @return
     */
   
    
       
}// end of class

    

