
package dsassignment_1;

import java.util.Arrays;


public class Anagram {
    
    public static void IsAnagram(String a, String b){
        
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            
            System.out.println("It is an Anagram.");
        }
        else{
            System.out.println("It is not an Anagram");
        }
    }
}
