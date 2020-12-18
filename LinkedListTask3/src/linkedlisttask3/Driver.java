
package linkedlisttask3;

import java.util.Scanner;

public class Driver {
    
     public static SinglyLinkedList joinLists(SinglyLinkedList p, SinglyLinkedList q){
        
        SinglyLinkedList.Node current1 = p.head;
        SinglyLinkedList.Node current2 = q.head;
       // Node current = p.tail;
       // current.next = q.head;
        SinglyLinkedList j = new SinglyLinkedList();
        while(current1!=null){
            j.addNode(current1.data);
            current1 = current1.next;
        }
        
        while(current2!=null){
            j.addNode(current2.data);
            current2 = current2.next;
        }
        
        return j;
        
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList sList = new SinglyLinkedList();    
        
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);
        sList.addNode(5);
        
            
        //Displays the nodes present in the list    
        sList.display();
        
        System.out.println("Total nodes are: " + sList.countNodes());
        System.out.println("");
        sList.searchNode(4);
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any integer to be added to the start of the list: ");
        int start = in.nextInt();
        System.out.println("");
        System.out.print("Enter any integer to be added to the end of the list: ");
        int end = in.nextInt();
        System.out.println("");
        sList.addAtStart(start);
        sList.addAtEnd(end);
        
        System.out.println("List after adding at the start and in the end:");
        sList.display();
        System.out.println("------------------------");
        
        System.out.println("List after deleting the element from Start:");
        sList.deleteFromStart();
        sList.display();
        System.out.println("-------------------------");
        
        System.out.println("List after deleting the element from end: ");
        sList.deleteFromEnd();
        sList.display();
        System.out.println("-------------------------");
        
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.addNode(10);
        list.addNode(11);
        list.addNode(12);
        
        SinglyLinkedList lList = joinLists(sList,list);
        System.out.println("Merged List will be: ");
        lList.display();
        
    
}

    
}
