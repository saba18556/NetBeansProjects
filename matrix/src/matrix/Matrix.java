
package matrix;

public class Matrix {

    public static void main(String[] args) {
        
        int [] data = new int [5];
data [0]=27;
data [1]=51;
data [2]=33;
data [3]=-1;
data [4]=101;
for(int i=0;i<data.length;i++){
    if (i==0){
System.out.print( "data = "+"[" + data[i]);
    }
    else if (i>0 && i<data.length-1){
        System.out.print(", " + data[i]);
    }
    else if (i==data.length-1){
        System.out.print(", " + data[i]+ "]");
    }
}
       
    }
    
}
