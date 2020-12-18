
package dsassignment_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Node1{
        
        Node1 next;
         String word;
        
        
        public Node1(String word) {    
            this.word = word;
            this.next = null;
            
        }
        
        public String get_data(){
            return this.word;
        }
    }

public class LinkedListOfWords {
    
    public static Node1[] createArrayOfLL(String path) throws IOException {
       
        FileReader file = new FileReader(path);
        BufferedReader b = new BufferedReader(file);
        String line;

        Node1[] list = new Node1[26];

        while ((line= b.readLine()) != null) {

            char c = Character.toLowerCase(line.trim().charAt(0));
            
            Node1 newNode = new Node1(line);

             Node1 head = list[c - 97];
             newNode.next = head;
             list[c - 97] = newNode;
        }
        return list;
        
}
    
}
