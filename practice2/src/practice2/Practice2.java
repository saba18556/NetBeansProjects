
package practice2;

public class Practice2 {

    public static void main(String[] args) {
         int[] arr ={1,2,6,4,5};
         int temp=0;
         int i=0;
         int j=1;
         int k=0;
         while(k<arr.length/2){
             
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             
             i=i+2;
             j=j+2;
             k++;
             }
              
             
         
         for( i=0;i<arr.length;i++)
         System.out.println(arr[i]);
    }
    
}
