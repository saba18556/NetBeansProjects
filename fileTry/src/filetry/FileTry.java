
package filetry;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTry {

    public static void main(String[] args) throws FileNotFoundException {
        
        String str = null;
        double amount = 0.0;
        java.io.File file = new java.io.File("transactions.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            
            str = input.nextLine();
            String[] list = str.split(",");
            System.out.println(list[1]+" "+list[3]+" with per unit cost "+list[2]+" was sold with SKU "+list[0]);
            amount+=Double.parseDouble(list[1])*Double.parseDouble(list[2]);
            
        }
        System.out.println("Total amount of sale: "+amount);
        
        input.close();
    }
    
}
