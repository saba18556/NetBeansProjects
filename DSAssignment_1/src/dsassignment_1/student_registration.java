
package dsassignment_1;


public class student_registration {
    
    class Node{    
        Node next;
        String name;    
        Object[] course;    
            
        public Node(String name) {    
            this.name = name;
            this.next = null;
            this.course = new Object[6];
            for(int i=0; i<course.length; i++){
                course[i] = null;
            }
        }
        
        public boolean IsFull(){
            boolean flag = true;
            for (Object course1 : course) {
                if (course1 == null) {
                    flag = false;
                    break;
                }
            }
            return flag;
            
        }
        
        public boolean IsEmpty(){
            boolean flag = true;
            for (Object course1 : course) {
                if (course1 != null) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
        
         public void setCourse(Object course){
             if(IsFull()){
                 System.out.println("You have reached the limit to 6 courses. Cannot be added further.");
                 return;
             }
             else{
                 for(int i=0; i<this.course.length; i++){
                     if(this.course[i] == null){
                         this.course[i] = course;
                         System.out.println("Added: "+this.course[i]);
                         break;
                     }
                 }
             }
     }
         
         public void drop(Object course){
             
             if(IsEmpty()){
                 System.out.println("You have no courses to drop.");
                 return;
             }
             else{
                 for(int i=0; i<this.course.length; i++){
                     if(this.course[i]== course){
                         System.out.println("Dropped: "+this.course[i]);
                         this.course[i] = null;
                         break;
                     }
                 }
             }
             
         }
         public void display(){
             if(IsEmpty()){
                 System.out.println("There are no courses to show.");
             }
             else{
                 
             for(int i=0;i<course.length;i++){
                 if(course[i]==null){
                     continue;
                 }
                 else{
                 
                     System.out.println("--> " + course[i]);
                 }
             }
         }
         }
    }
    
     Node head = null;
     Node tail = null;
     
     public void add_student(String name){
         
         Node newNode = new Node(name);
         
         if(head==null){
             head = newNode;
             tail = newNode;
         }
         
         else{
             tail.next = newNode;
             tail = newNode;
         }
     }
     
     public Node get_student(String name){
         Node current = head;
         while(current!=null){
             if((current.name).equals(name)){
                 break;
             }
             current = current.next;
         }
         return current;
//         return tail;
     }
     
    
     
     public void add_course(String name,Object course){
         get_student(name).setCourse(course);
         
     }
     
     public void show_courses(String name){
         
         System.out.println("Courses in "+ name +"'s cart: " );
         get_student(name).display();
     }
     
     public void drop_course(String name, Object course){
         get_student(name).drop(course);
     }
     
     public void display_students() {    
         
        Node current = head;    
            
        if(head == null) {    
            System.out.println("No students enrolled yet.");    
            return;    
        }    
         System.out.println("\nStudents Enrolled: ");    
        while(current != null) {    
                
            System.out.println("--> "+current.name + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
    
}
