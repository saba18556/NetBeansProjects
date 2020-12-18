
package labtask7;

public class LabTask7 {
    
    
    public static void main(String[] args) {
        
        System.out.println("Q1 and Q3:\n");
        QueueByArray queue = new QueueByArray(5);
        
        System.out.println("Adding values: ");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        
        System.out.println("Displaying values: ");
        queue.display_queue();
        

        
        System.out.println("Deleting some values: ");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
       
        
        
        System.out.println("Displaying values: ");
        queue.display_queue();
        
        System.out.println("who is at front? ");
        System.out.println(queue.peek_front());

        
        System.out.println("Adding from the front: ");
        queue.put_front(8);
        queue.display_queue();
        
        System.out.println( queue.get_rear());
        System.out.println("who is at front? ");
        System.out.println(queue.peek_front());
        
        
        System.out.println("---------------------------------\n");
        System.out.println("Q2:\n");
        
        QueueByLL queues = new QueueByLL();
        
        System.out.println("Adding values:\n");
        queues.enqueue(1);
        queues.enqueue(2);
        queues.enqueue(3);
        queues.enqueue(4);
        queues.enqueue(5);
        
        System.out.println("Displaying Values:\n");
        queues.display();
        
        System.out.println("Removing from rear:\n");
        queues.dequeue();
        queues.dequeue();
        
        System.out.println("Displaying Values:\n");
        queues.display();
        
        System.out.println("Who is at the front: "+queues.seek_front());
        
        
        
        
    }
    
}
