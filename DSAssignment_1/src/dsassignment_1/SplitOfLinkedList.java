
package dsassignment_1;

class Node2{
    
    int data;
    Node2 next;
    
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}

class Splits{
    
    public Node2 head = null;
    public Node2 tail = null;
    
    public void addNode(int data){
        
        Node2 newNode = new Node2(data);
        
        if(head==null){
            this.head = newNode;
            this.tail = newNode;
        }
        
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    


    public int length(){
        
        Node2 counter = head;
        int count = 0;
        
        while(counter!=null){
            count++;
            counter = counter.next;
        }
        return count;
    }
    
    public Node2[] FrontBackSplit(){
        
        
        Node2 first, second;
        int size = length();
        if(size<2){
            first = head;
            second = null;
            return new Node2[] {first, second};
        }
        
        Node2 current = head;
        int count = (size - 1)/2;
        for(int i=0; i<count; i++){
            current = current.next;
        }
        
        first = head;
        second = current.next;
        current.next = null;
        
        return new Node2[] {first, second};
        
    }
    
    
}

public class SplitOfLinkedList {
    
    public static void display(Nodes temp){
         Nodes current = temp;    
            
        if(temp == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Split Nodes: ");    
        while(current != null) {    
              
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }
   
    
}
