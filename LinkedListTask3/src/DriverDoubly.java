
public class DriverDoubly {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkTest<Integer> dList= new DoublyLinkTest<Integer>();
        dList.addLast(6);
        dList.addLast(7);
        dList.addLast(9);
        dList.addAfter(7, 2); //send elements or data ONLY in the parameters
        dList.remove(2);// send elements or data ONLY in the parameters
        dList.iterateForward();
        dList.iterateBackward();
       // dList.removeFirst();
       // dList.removeLast();
       // dList.iterateBackward();
        
        //Displays the nodes present in the list    
      //  sList.display();    

	}
}
