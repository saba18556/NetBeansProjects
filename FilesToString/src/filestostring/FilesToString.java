
package filestostring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 class Node{
        
        Node next;
         String word;
        
        
        public Node(String word) {    
            this.word = word;
            this.next = null;
            
        }
        
        public String get_data(){
            return this.word;
        }
    }

    

public class FilesToString {
    
    /**
     *
     * @param inputfile
     * @return
     * @throws IOException
     */
    public static Node[] createArrayOfLL(String path) throws IOException {
       
        FileReader file = new FileReader(path);
        BufferedReader b = new BufferedReader(file);
        String line;

        Node[] list = new Node[26];

        while ((line= b.readLine()) != null) {

            char c = Character.toLowerCase(line.trim().charAt(0));
            
            Node newNode = new Node(line);

             Node head = list[c - 97];
             newNode.next = head;
             list[c - 97] = newNode;
        }
        return list;
        
}

    
    public static void main(String[] args) throws IOException {
        
        
         String path = "C:\\Users\\Saba fatima\\Documents\\NetBeansProjects\\FilesToString\\src\\filestostring\\sample.txt";
        Node[] array = createArrayOfLL(path);
       
        for(int i=0;i<array.length;i++){
            
            Node temp = array[i];
            if(array[i]!= null){
                System.out.print("("+((char)(i+97))+") -->\t");
                while(temp!= null){
                    System.out.print(temp.word + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }
    
}
