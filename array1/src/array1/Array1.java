
package array1;


public class Array1 {

    public static int sum (int n){
        
        return n*n;
    }
    
     public static int sum1 (int n){
        
       int sum =0;
        
        for(int i=1;i<=n;i++){
            sum+=n;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        System.out.println(sum1(6));
        System.out.println(sum(6));
        
    }
    
}
