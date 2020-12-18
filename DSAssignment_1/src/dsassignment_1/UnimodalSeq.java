
package dsassignment_1;


public class UnimodalSeq {
    
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
    
}
