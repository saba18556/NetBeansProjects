package militarytime;

import java.util.Scanner;

public class MilitaryTime {

    public static void main(String[] args) {
        
         Scanner in= new Scanner (System.in);
        System.out.println("Enter the time in hours, minutes and seconds");
        System.out.print("Hours=");
        int hour = in.nextInt();
        System.out.print("Minutes=");
        int mins = in.nextInt();
        System.out.print("Seconds=");
        int sec = in.nextInt();
        System.out.println("Enter AM or PM");
        String a= in.next();
        System.out.println(hour+":"+mins+":"+sec+a);
        if(a.matches("AM")){
            
            System.out.println("The military time is"+hour+":"+mins+":"+sec);
        }
        else if(a.matches("PM")){
             System.out.println("The military time is"+(hour+12)+":"+mins+":"+sec);
        }


    }
    
}
