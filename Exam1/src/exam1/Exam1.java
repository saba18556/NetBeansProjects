
package exam1;


public class Exam1 {

    
    public static void main(String[] args) {
    int result=mystery2(348);
        System.out.println(result);
    }
        
        public static int mystery2(int num) {
if (num <= 0)
return 0;
int a=num%10;
return mystery2(num/10)*100+a*11;
}
}
    
    

