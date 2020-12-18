
package labtask7;


public class Queue {
    
    final int size;
    int front;
    int rear;
    int[] list;
    
    
    Queue(int n){
        this.front =  -1;
        this.rear = -1;
        this.size = n;
         list  = new int[size];
    }
    
     public boolean IsEmpty(){
            return (front==-1 && rear == -1);
    }
     
     public boolean IsFull(){
         return ((rear+1)%size == front);
     }
     
     public void enqueue(int n){
         if(IsFull()){
             System.out.println("Queue OverFlow Exception");
         }
         
         else if(IsEmpty()){
             this.front = 0;
             this.rear = 0;
         }
         
         else{
             this.rear = (rear+1)%size;
         }
         
         list[rear] = n;
     }
     
     public int dequeue(){
         
         if(IsEmpty()){
             System.out.println("Queue UnderFlow Exception");
             return -1;
         }
         
         else if (front==rear){
             this.front = -1;
             this.rear = -1;
         }
         
         else{
             this.front = (front+1)%size;
         }
         
         return front;
     }
     
     public int peek_front(){
         return list[front];
     }
     
      public int peek_back(){
         return list[rear];
     }
     
     public void display_queue(){
            
            if(IsEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            if(front<=rear){
            for(int i=front;i<=rear;i++){
                System.out.println("--> "+list[i]+" at "+i+"\n");
            }
            }
            else{
                for(int i=front; i<list.length; i++){
                    System.out.println("--> "+list[i]+" at "+i+"\n");
                }
                for(int i=0; i<=rear; i++){
                    System.out.println("--> "+list[i]+" at "+i+"\n");
                }
            }
        }
     
     public void put_front(int n){
         
         this.rear = (rear+1)%size;
            
            if(IsFull()){
                System.out.println("Queue OverFlow Exception");
            }
            
            
            if(IsEmpty()){
                enqueue(n);
            }
            else if(front<rear && rear <= list.length-1){
                
                for(int i=rear; i>front; i--){
                    list[i] =list[i-1];
                }
                
                list[front] = n;
            }
            
            
            
            else{
                 
                
                 for(int i=rear; i>0 ;i--){
                    list[i] =list[i-1];
                }
                
                list[0] = list[list.length-1];
                
                for(int i=list.length-1; i>front; i--){
                     list[i] =list[i-1];
                }
                
                list[front] = n;
                

                
            
            }
        
            
        }
     
      public int get_rear(){
            
            if(IsEmpty()){
                System.out.println("Queue UnderFlow Exception");
                return -1;
            }
            if(front==0 && rear==0){
                this.front = -1;
                this.rear = -1;
                System.out.print("rear will be: ");
                return this.rear;
            }
            else if(rear==0){
                this.rear = size - 1;
                System.out.print("rear will be: ");
                return this.rear;
            }
            
            else{
                this.rear--;
                System.out.print("rear will be: ");
                return list[rear];
            }
            
        }
    
}
