package javaapplication48;

public class JavaApplication48 {

    public static int max (int i1, int i2, int i3){
        if (i1==i2&&i1==i3)
            return -1;
        else if (i1>i2&&i1>i3)
            return i1;
        else if (i2>i1&&i2>i3)
            return i2;
        else
            return i3;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The largest number between -7, 0 and 10 is " + max(-7,0,10));
                
    }
    
}
