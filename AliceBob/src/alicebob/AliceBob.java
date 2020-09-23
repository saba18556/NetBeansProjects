
package alicebob;

public class AliceBob {
    
    public static int[] comp(int[] a, int[] b){
        
        int alice = 0;
        int bb = 0;
       
        for(int i = 0;i<a.length;i++){
            if (a[i]>b[i]){
                alice++;
            }
            else if (a[i]<b[i]){
                
                bb++;
            }
            else{
                alice +=0;
                bb += 0;
            }
        }
        int[] arr ={alice, bb};
        return arr;
    }

    public static void main(String[] args) {
        
        int[] a = {17, 28, 30};
        int[] b = {99, 16, 8};
        int[] c = comp(a,b);
        System.out.println(c);

        
        
        
    }
    
}
