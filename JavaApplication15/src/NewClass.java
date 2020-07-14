
import java.util.Scanner;

public class NewClass {
    
    public static void main(String[] args){
    
        //Scanner input
        Scanner in = new Scanner(System.in);
        
        //Prompt input from user
        char A = in.next().charAt(0);
        System.out.println("Enter the type of filer= " + A);
        
        if ((A=='s')||(A=='S')){
            
            double value = in.nextDouble();
            System.out.println("Enter the income in dollars= "+ value);
      
        
        if ((value>=0)&&(value<=8.35)){
            
            double tax1= value*0.1;
            System.out.println("The payable tax be= " + tax1);
            
        }
        
        else if ((value>=8.351) &&(value<=33.95)){
            
            double tax2= value*0.15;
            System.out.println("The payable tax be= " + tax2);
            
        }
        
        else if ((33.951>=value)&&(value<=82.25)){
            
            double tax3= value*0.25;
            System.out.println("The payable tax be= " + tax3);
            
        }
        
        else if ((value>=82.251)&&(value<=171.55)){
            
            double tax4= value*0.28;
            System.out.println("The payable tax be= " + tax4);
            
        }
            
        else if ((value>=171.551)&&(value<=372.95)){
            
            double tax5= value*0.33;
            System.out.println("The payable tax be= " + tax5);
            
        }
        
        else {
            
            double tax6= value*0.35;
            System.out.println("The payable tax be= " + tax6);
            
        }
    }
            
            
            
            
        
        else if ((A=='J')||(A=='j')){
            
            double value= in.nextDouble();
            System.out.println("Enter the income in dollars= "+ value);
            
            if ((value>0)){
                
                double tax1= value*0.1;
                System.out.println("The payable tax be= " + tax1);
                
            }
            
            else if ((value>=16.701)&&(value<=67.9)){
                
                double tax2= value*0.15;
                System.out.println("The payable tax be= "+ tax2);
                
            }
            
            else if ((value>=67.901)&&(value<=137.05)){
                
                double tax3= value*0.25;
                System.out.println("The payable tax be= "+ tax3);
                
            }
            
            else if ((value>=137.051)&&(value<=208.85)){
                
                double tax4= value*0.28;
                System.out.println("The payable tax be= "+ tax4);
                
            }
            
            else if ((value>=208.851)&&(value<=372.95)){
              
                double tax5= value*0.33;
                System.out.println("The payable tax be= "+ tax5);
                
            }
            
        else if ((A=='F')||(A=='f'))
                        {}
        else if((A=='H')||(A=='h'))
                                {}
    }
    
}
}
