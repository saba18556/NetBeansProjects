
package labtask7;

import java.util.ArrayList;


public class QueueByArray_1 {
    
    public int max_size;
        public int front;
        public int rear;
        ArrayList <Integer> list = new ArrayList(max_size);

        
         QueueByArray_1(int n){
            
            this.front = -1;
            this.rear = -1;
            this.max_size = n;
            
        }
        
        public boolean IsEmpty(){
            return front==-1 && rear == -1;
        }
        
        public boolean IsFull(){
            return ((front==0 && rear== max_size-1)|| (front==rear+1));
        }
        
       
        
        public void enqueue(int n){
            
            if(IsFull()){
                System.out.println("Queue OverFlow Exception");
                return;
            }
           
            else {
                if(IsEmpty()){
                    front =0;
                    rear = 0;
                    list.add(rear, n);
                }
                else if(front!=0 && rear==max_size-1){
                   rear = 0;
                   list.set(rear, n);
                }
                else{
                    this.rear+=1;
                    list.add(rear, n);
                }
                
            }
            
        }
        
        public int dequeue(){
            if(IsEmpty()){
                System.out.println("Queue UnderFlow Exception");
                return -1;
            }
            if(front==0 && rear==0){
                this.front = -1;
                this.rear = -1;
                System.out.print("Front will be: ");
                return this.front;
            }
            else if(front == max_size-1){
                this.front = 0;
                System.out.print("Front will be: ");
                return this.front;
            }
            else{
                this.front++;
                System.out.print("Front will be: ");
                return this.front;
            }
            
            
        }
        
        public void display_queue(){
            
            if(IsEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            if(front<=rear){
            for(int i=front;i<=rear;i++){
                System.out.println("--> "+list.get(i)+" at "+i+"\n");
            }
            }
            else{
                for(int i=front; i<list.size(); i++){
                    System.out.println("--> "+list.get(i)+" at "+i+"\n");
                }
                for(int i=0; i<=rear; i++){
                    System.out.println("--> "+list.get(i)+" at "+i+"\n");
                }
            }
        }
        
        public int peek_front(){
            return list.get(front);
        }
        
        public void put_front(int n){
            
            this.rear = (rear+1)%max_size;
            
            if(IsFull()){
                System.out.println("Queue OverFlow Exception");
            }
            
            
            if(IsEmpty()){
                front =0;
                rear = 0;
               list.add(rear, n);
            }
            else if(front<rear && rear <= list.size()-1){
                
                for(int i=rear; i>front; i--){
                    list.set(i, list.get(i-1));
                }
                
                list.set(front, n);
            }
            
            else{
                
                 for(int i=rear; i>0 ;i--){
                    list.set(i, list.get(i-1));
                }
                
                list.set(0, list.get(list.size()-1));
                
                for(int i=list.size()-1; i>front; i--){
                     list.set(i, list.get(i-1));
                }
                
                 list.set(front, n);

            
            }
        
            
        }
        
        public int get_rear(){
            
            int temp;
            if(IsEmpty()){
                System.out.println("Queue UnderFlow Exception");
                return -1;
            }
            if(front==0 && rear==0){
                temp = this.rear;
                this.front = -1;
                this.rear = -1;
                System.out.print("The new rear will be: "+ list.get(rear)+"\nIt will be removed: ");
                return list.get(temp);
                
            }
            else if(rear==0){
                
                 temp=this.rear;
                this.rear = max_size - 1;
                 System.out.print("The new rear will be: "+ list.get(rear)+"\nIt will be removed: ");
                return list.get(temp);
               
            }
            
            else{
                temp = this.rear;
                this.rear--;
                 System.out.print("The new rear will be: "+ list.get(rear)+"\nIt will be removed: ");
                return list.get(temp);
            }
            
        }
    
}
