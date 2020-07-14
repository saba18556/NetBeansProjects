
package recbinsearch;


public class RecBinSearch {
    
    public static boolean palindrome(String s){
        if (s.length()<=1)
            return true;
        else if (s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        else
            return palindrome(s.substring(1,s.length()-1));
    }

    
    public static void main(String[] args) {
        System.out.println("Is noon a palindrome \n" + palindrome("noon"));
                
       
    }
    
}
