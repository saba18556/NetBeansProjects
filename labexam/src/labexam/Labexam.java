
package labexam;

import java.util.ArrayList;

class QueueByArrays {
    
    public int max_size;
        public int front;
        public int rear;
        ArrayList <Integer> list = new ArrayList(100);

        
         QueueByArrays(int n){
            
            this.front = 0;
            this.rear = n;
            
        }
        

        
       
        
        public void enqueue( int jump){
            
            for(int i=0;i<list.size();i++){
                if(rear==99){
                    rear=0;
                    rear+=jump;
                    int temp = rear;
                    list.add(rear, temp);
                }
                else{
                    rear=+1;
                    rear+=jump;
                    int temp = rear;
                    list.add(rear, temp);
                }
                
            }
                   
           
            
        }
        public void display(){
            for(int i=0;i<list.size();i++){
                if(list.get(i)==0){
                    continue;
                }
                else{
                    System.out.println("");
                }
            }
}
        public ArrayList<Integer> get_list(){
            return list;
        }
}
        
public class Labexam {
    
     static void spin_the_wheel(int x1, int x2, int j1, int j2){
        
    QueueByArrays q1 = new QueueByArrays(x1);
    QueueByArrays q2 = new QueueByArrays(x2);
    q1.enqueue(j1);
    q2.enqueue(j2);
    
    for(int i=0;i<q1.get_list().size();i++){
        if(q1.get_list().get(i)==99){
            System.out.println("player 1 wins");
        }
        else{
            System.out.println("player 1 does not wins");
        }
    }
    for(int i=0;i<q2.get_list().size();i++){
        if(q1.get_list().get(i)==99){
            System.out.println("player 2 wins");
        }
        else{
            System.out.println("player 2 does not wins");
        }
    }
    
    q1.display();
    q2.display();
}

    
    public static void main(String[] args) {
        
        spin_the_wheel(99, 0, 7, 7);
    }
    
}
