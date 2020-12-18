
public class SinglyCircularList {
    
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }
     public Node head = null;
     public void add_Node(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            //tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            Node temp = head;
            while (temp.next!=head){
                temp = temp.next;
            }
            //newNode will become new tail of the list    
            temp.next = newNode;
            newNode.next = head;
        }    
    }    
    
     
    
}
