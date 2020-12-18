
package splitofll;

class Nodes{
    
    int data;
    Nodes next;
    
    Nodes(int data){
        this.data = data;
        this.next = null;
    }
}

class Split{
    
    public Nodes head = null;
    public Nodes tail = null;
    
    public void addNode(int data){
        
        Nodes newNode = new Nodes(data);
        
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
        
        Nodes counter = head;
        int count = 0;
        
        while(counter!=null){
            count++;
            counter = counter.next;
        }
        return count;
    }
    
    public Nodes[] FrontBackSplit(){
        
        
        Nodes first, second;
        int size = length();
        if(size<2){
            first = head;
            second = null;
            return new Nodes[] {first, second};
        }
        
        Nodes current = head;
        int count = (size - 1)/2;
        for(int i=0; i<count; i++){
            current = current.next;
        }
        
        first = head;
        second = current.next;
        current.next = null;
        
        return new Nodes[] {first, second};
        
    }
    
    
}


public class SplitOfLL {
    
    public static void display(Nodes temp){
         Nodes current = temp;    
            
        if(temp == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
              
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }
//
//    public static int length(Node temp){
//        
//        Node counter = temp;
//        int count = 0;
//        
//        while(counter!=null){
//            count++;
//            counter = counter.next;
//        }
//        return count;
//    }
//    
//    public static Node[] FrontBackSplit(Node temp){
//        
//        Node first, second;
//        int size = length(temp);
//        if(size<2){
//            first = temp;
//            second = null;
//            return new Node[] {first, second};
//        }
//        
//        Node current = temp;
//        int count = (size - 1)/2;
//        for(int i=0; i<count; i++){
//            current = current.next;
//        }
//        
//        first = temp;
//        second = current.next;
//        current.next = null;
//        
//        return new Node[] {first, second};
//        
//    }
    
    public static int top (int[] arr, int high, int low){
        
        int key = (low +high)/2;
        if((key==0 || arr[key - 1]<= arr[key])&&(key == (arr.length - 1) || arr[key+1]<= arr[key])){
            return arr[key];
        }
        
        else if(key>0 && arr[key-1]>arr[key]){
            return top(arr, (key - 1), low);
        }
        else{
            return top(arr, high, (key + 1));
        }
        
        
    }
    
    public static void main(String[] args) {
        
        int[] array = {2, 3, 5, 7, 11};
        
        Split temp = new Split();
        
        for(int i=0;i<array.length;i++){
            temp.addNode(array[i]);
        }
        
        Nodes[] newNode = temp.FrontBackSplit();
        display(newNode[0]);
        display(newNode[1]);
        
        int[] arr = {1, 3, 5, 9, 4, 1}; 
        System.out.println(top(arr, (arr.length - 1), 0));
        
    }
    
}
