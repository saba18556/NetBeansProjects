
package labtask7;


public class QueueByLL {
    
    class Node{
        
        Object data;
        Node next;
        
        public Node(Object data){
            this.data = data;
            this.next = null;
        }
    }
    
    public Node front;
    public Node rear;
    
    QueueByLL(){
        
        this.front = null;
        this.rear = null;
    }
    
    public boolean isEmpty(){
        return (front == null && rear==null);
    }
    
    public void enqueue(Object data){
        
        Node temp = new Node(data);
        
        if(rear==null){
            this.front = temp;
            this.rear = temp;
        }
        
        this.rear.next = temp;
        this.rear = temp;
        
    }
    
    public Object dequeue(){
        if(front==null){
            return -1;
        }
        front = front.next;
        if(front==null){
            rear = null;
        }
        return front;
    }
    
    public Object seek_front(){
        return front.data;
    }
    
    public void display(){
        
        Node temp = front;
        
        if(front==null){
            System.out.println("Queue UnderFlow Exception");
        }
        
        System.out.println("Nodes of Queue: ");    
        while(temp != null) {    
               
            System.out.println("-->"+temp.data + " ");    
            temp = temp.next;    
        }    
        System.out.println();
        
    }
    
}
