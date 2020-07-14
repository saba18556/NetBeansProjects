
package javaapplication7;


public class JavaApplication7 {

    
    public static void main(String[] args) {
        
        long time = System.currentTimeMillis();
        System.out.println(time);
        long S = time/1000;
        long M = S/60;
        long H = M/60;
        long RS = S % 60;
        long RM = M % 60;
        long RH = H % 24;
        System.out.println((RH + 5) + ":" + RM + ":" + RS);
        
    }
    
}
