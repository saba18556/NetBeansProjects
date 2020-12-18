
package dsassignment_1;

import static dsassignment_1.DSAssignment_1.postfix_evaluation;


public class Prefix_Evaluation {
    
     public static int prefix_evaluation(String exp){
       
       StringBuilder sdf = new StringBuilder(exp);
       String str = sdf.reverse().toString();
       
       
       return postfix_evaluation(str);
   }
    
}
