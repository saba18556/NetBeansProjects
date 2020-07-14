
package arraycheck;

public class ArrayCheck {
    
    public static boolean check(int[] a, int [] b){
        int n=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    n++;
                }
            }
        }
        if(b.length==n)
            return true;
        else
           return false;
    }

    public static void main(String[] args) {
          
        int[] a ={1,4,9,16,9,7,9,11};
        int[] b ={11, 11, 7,9,16,4,1};
        System.out.println(check(a,b));
    }
    
}
