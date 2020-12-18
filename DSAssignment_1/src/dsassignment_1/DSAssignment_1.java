
package dsassignment_1;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

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

class Stack1{
    int max;
    int top;
    String[] ch;
    
    boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       Stack1(int n) 
	{ 
		top = -1;
                max = n;
		ch = new String[max];
	} 
       
       public boolean push(String x) 
	{ 
		if (top >= max){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			top++; ch[top] = x;  
			//System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 
       
       public String pop(){
           
           if(top<0){
               return "Stack Underflow exception";
           }
           else{
               String x = ch[top--]; 
            return x;
           }
       }
       
       public String peek(){
           return ch[top];
       }
    
}

class Stacks{
    
    int max;
    int top;
    int[] ch;
    
    boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       Stacks(int n) 
	{ 
		top = -1;
                max = n;
		ch = new int[max];
	} 
       
       public boolean push(int x) 
	{ 
		if (top >= max){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			top++; ch[top] = x;  
			//System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 
       
       public int pop(){
           
           if(top<0){
               System.out.println("Stack Underflow");
               return 0;
           }
           else{
               int x = ch[top--]; 
            return x;
           }
       }
    
}

class Stack{
    int max;
    int top;
    char[] ch;
    
    boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
        
       Stack(int n) 
	{ 
		top = -1;
                max = n;
		ch = new char[max];
	} 
       
       public boolean push(char x) 
	{ 
		if (top >= max){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			top++; ch[top] = x;  
			//System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 
       
       public char pop(){
           
           if(top<0){
               System.out.println("Stack Underflow");
               return 0;
           }
           else{
               char x = ch[top--]; 
            return x;
           }
       }
       
       public char peek(){
           return ch[top];
       }
    
}

public class DSAssignment_1 {
    
    public static void IsAnagram(String a, String b){
        
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            
            System.out.println("It is an Anagram.");
        }
        else{
            System.out.println("It is not an Anagram");
        }
    }

   public static int[][] transpose(int[][] matrix){
       
       int row = matrix.length;
       int col = matrix[0].length;
       int[][] matrix2 = new int[col][row];
       
       for(int i=0; i<col; i++){
           for(int j=0; j<row; j++){
               matrix2[i][j] = matrix[j][i];
           }
       }
       return matrix2;
       
   }
   public static double[][] blur_image(double[][] matrix){
       
       double[][] matrix1 = new double[matrix.length][matrix[0].length];
       
       for(int i=0 ;i<matrix.length;i++){
           for(int j=0 ; j<matrix[i].length; j++){
               if(i==0 && j==0){
                   matrix1[i][j] = (matrix[i][j]+matrix[i+1][j]+matrix[i][j+1])/3;
               }
               else if(i==0 && j==(matrix[0].length-1)){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j-1]+matrix[i+1][j])/3;
               }
               else if(i==0 && !(j==0 && j==(matrix[0].length-1))){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j-1]+matrix[i][j+1]+matrix[i+1][j])/4;
               }
               else if(j==0 && i==(matrix.length-1)){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j+1]+matrix[i-1][j])/3;
               }
               else if(j==0 && !(i==0 && j==(matrix.length-1))){
                   matrix1[i][j] = (matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i-1][j])/4;
               }
               else if(i==(matrix.length-1) && j==(matrix[0].length-1)){
                   matrix1[i][j] = (matrix[i][j] + matrix[i][j-1] + matrix[i-1][j])/3;
               }
               else if(i==(matrix.length-1)&&!(j==0&&j==(matrix[0].length-1))){
                   matrix1[i][j] = (matrix[i][j] + matrix[i-1][j]+matrix[i][j-1]+matrix[i][j+1])/4;
               }
               else if(j==(matrix[0].length-1)&&!(i==0&&i==(matrix.length-1))){
                   matrix1[i][j] = (matrix[i][j] + matrix[i-1][j]+matrix[i+1][j] + matrix[i][j-1])/4;
               }
               else{
                   matrix1[i][j] = (matrix[i][j] + matrix[i+1][j] + matrix[i-1][j] +matrix[i][j+1] +matrix[i][j-1])/5;
               }
           }
       }
       return matrix1;
   }
   public static int evaluate(char op, int val1, int val2){
           
           int result = 0;
        switch (op) {
            case '+':
                result = val2 + val1;
                break;
            case '-':
                result = val2 - val1;
                break;
            case '/':
                result = val2 / val1;
                break;
            case '*':
                result = val2 * val1;
                break;                
        }
        return result;
       }
   public static int postfix_evaluation(String str){
       
       Stacks s = new Stacks(str.length());
       
       for(int i=0; i<str.length(); i++){
           if(Character.isDigit(str.charAt(i))){
               s.push(Integer.parseInt(String.valueOf(str.charAt(i))));
           }
           else{
               s.push(evaluate(str.charAt(i),s.pop(),s.pop()));
           }
       }
       return s.pop();
       
   }
   
   public static String reverseIt(String input){
       
       byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        return (new String(result));
       
   }
   
  
    
    public static int precedenceOf(char C) { 
    if (C == '-' || C == '+'){ 
        return 1; 
    }
    else if (C == '*' || C == '/') {
        return 2; 
    }
    else{
    return 0; 
    }
} 
   
 public static String infix_to_prefix(String str) { 
    
    Stack operators = new Stack(str.length()); 
   
    Stack1 operands = new Stack1(str.length());
  
    for (int i = 0; i < str.length(); i++){
        
        char c = str.charAt(i);
        
        if(c==' '){
            continue;
        }
   
        else if (c == '(')  { 
            operators.push(str.charAt(i)); 
        } 
  
        else if (c == ')')  { 
            while (!operators.isEmpty() &&  operators.peek() != '(')  { 
                String a = operands.pop() + operands.pop()+ operators.pop(); 
                operands.push(a);
            } 
  
            operators.pop(); 
        }
        else if (Character.isDigit(c) || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))  { 
            operands.push(Character.toString(c)); 
        } 
        
        else { 
            while (!operators.isEmpty() &&  precedenceOf(c) <=  precedenceOf(operators.peek()))  { 
                String a = operands.pop() + operands.pop()+ operators.pop(); 
                operands.push(a); 
            } 
            operators.push(c); 
        } 
    } 
  
    while (!operators.isEmpty())  { 
        String a = reverseIt(operands.pop() + operands.pop()+ operators.pop()); 
        operands.push(a);
    } 
   
    return operands.peek(); 
} 
   
   public static int prefix_evaluation(String exp){
       
       StringBuilder sdf = new StringBuilder(exp);
       String str = sdf.reverse().toString();
       
       
       return postfix_evaluation(str);
   }
   
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
   public static void display(Nodes temp){
         Nodes current = temp;    
            
        if(temp == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Split Nodes: ");    
        while(current != null) {    
              
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }
   
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
   
    public static void main(String[] args) throws IOException {
        
        System.out.println("------------------------- ASSIGNMENT 1 --------------------------------");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------\n");
        System.out.println("Q1 :\n");
        
        System.out.println("Input : Anagram, marganaa");
        System.out.print("Output : ");IsAnagram("Anagramm","marganaa");
        System.out.println("Input : hello, hlleo");
        System.out.print("Output : ");IsAnagram("hello","hlleo");
        System.out.println();
        System.out.println("---------------------------------------------------------------------\n");
        System.out.println("Q2 :\n");
        System.out.println("Input : 3   4   7\n"
                         + "        2   1   3\n");
        int[][] arr1 = {{ 3, 4, 7},{2, 1, 9}};
        
        System.out.println("Output : ");
        for(int i=0; i<arr1.length;i++){
            for (int j=0; j<arr1[i].length;j++){
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------\n");
        System.out.println("Q3 :\n");
        System.out.println("Input : 10  10  10  10  10\n"
                         + "        20  20  20  20  20\n"
                         + "        80  80  80  80  80\n"
                         + "        60  60  60  60  60\n"
                         + "        70  70  70  70  70\n");
        
        
        double[][] arr = {{10, 10, 10, 10, 10},
                          {20, 20, 20, 20, 20},
                          {80, 80, 80, 80, 80},
                          {60, 60, 60, 60, 60},
                          {70, 70, 70, 70, 70}};         
        
        double[][] arrs1 = blur_image(arr);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Output : ");
        for(int i=0; i<arrs1.length;i++){
            for (int j=0; j<arrs1[i].length;j++){
                System.out.print("\t"+df.format(arrs1[i][j]));
            }
            System.out.println("");
        }
        
        System.out.println();
        System.out.println("-----------------------------------------------------------------------\n");
        System.out.println("Q4 :\n");
        
        student_registration student = new student_registration();
        
        System.out.println("Enrolling Student : Saba \n");
        System.out.println("Enrolling Student : Tuba \n");
        student.add_student("Saba");
        student.add_student("Tuba");
        student.add_course("Saba", "CS 3137");
        System.out.println("");
        student.add_course("Saba", "CS 4107");
        System.out.println("");
        student.add_course("Saba", "CS 2553");
        System.out.println("");
        student.add_course("Saba", "CS 1089");
        System.out.println("");
        student.add_course("Saba", "CS 3062");
        System.out.println("");
        student.add_course("Saba", "CS 3311");
        System.out.println("");
        student.add_course("Saba", "CS 3311");
        System.out.println("");
        
        student.show_courses("Saba");
        System.out.println();
        student.drop_course("Tuba", "CS 3137");
        System.out.println();
        student.show_courses("Tuba");
        System.out.println();
        student.drop_course("Saba", "CS 3137");
        System.out.println();
        student.show_courses("Saba");
        System.out.println("");
        student.display_students();
        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------\n");
        System.out.println("Q5 :\n");
        
        String path = "C:\\Users\\Saba fatima\\Documents\\NetBeansProjects\\DSAssignment_1\\src\\dsassignment_1\\sample.txt";
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
        
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------\n");
        System.out.println("Q6 :\n");
        
        System.out.println("Input : {2, 3, 5, 7, 11}");
        int[] list= {2, 3, 5, 7, 11};
        
        Split temp = new Split();
        
        for(int i=0;i<list.length;i++){
            temp.addNode(list[i]);
        }
        
        System.out.println("Output :");
        Nodes[] newNode = temp.FrontBackSplit();
        display(newNode[0]);
        display(newNode[1]);
        
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------\n");
        System.out.println("Q7 :\n");
        
        System.out.println("Input : {1, 3, 5, 9, 4, 1}");
        int[] list2 = {1, 3, 5, 9, 4, 1}; 
        System.out.println("Output : "+top(list2, (list2.length - 1), 0));
        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------\n");
        System.out.println("Q8 :\n");
        
        System.out.println("Input : 231*+9-");
        System.out.println("Output : "+postfix_evaluation("231*+9-"));
        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------\n");
        System.out.println("Q9 :\n");
        
        System.out.println("Input : (A-(B/C))*((A/C)-B)");
        System.out.println("Output : "+infix_to_prefix("(A-(B/C))*((A/C)-B)"));
        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------\n");
        System.out.println("Q10 :\n");
        System.out.println("Input : +9*26");
        System.out.println("Output : "+prefix_evaluation("+9*26"));
        
        System.out.println();
        System.out.println("------------------------------END OF ASSIGNMENT------------------------------------");


    }
    
}
