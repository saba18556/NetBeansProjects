
package javaapplication72;


public class JavaApplication72 {

    public static double sumTo(int n){
        double num=0;
        double result =0;
        while(n>num){
        result+=1/(1+num);
        num++;
                }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(sumTo(2));
    }
    
}
