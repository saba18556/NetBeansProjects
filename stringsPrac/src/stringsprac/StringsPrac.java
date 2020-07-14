
package stringsprac;

public class StringsPrac {
    
    public static boolean find(String text, String str){
        if(text.length()<str.length())
            return false;
        if(text.contains(str))
            return true;
        
        return find(text.substring(1),str);
    }

    public static void main(String[] args) {
        
        System.out.println(find("Mississippi","ss"));
    }
    
}
