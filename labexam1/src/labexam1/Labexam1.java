
package labexam1;

import java.util.Arrays;

public class Labexam1 {
    
    public static void smallest_absdiff_pairs(int[] list){
        
        Arrays.sort(list);
        
        int min = list[1] - list[0];
        for(int i=2;i<list.length;i++){
            min = Math.min(min, list[i] - list[i-1]);
        }
        
        for(int i=1;i<list.length;i++){
            if((list[i]-list[i-1])==min){
                System.out.println("( " +list[i-1]+ ", "+list[i]+" )");
            }
        }
    }

    
    public static void main(String[] args) {
        
        int[] list = {5, 4, 3, 2};
        smallest_absdiff_pairs(list);
    }
    
}
