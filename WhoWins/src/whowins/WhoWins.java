package whowins;
import java.util.Scanner;
public class WhoWins {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter scores (no spaces after and before comma): ");
        String s = in.nextLine();
        System.out.println("Enter the team of your choice to know the performance: ");
        String a = in.nextLine();
        String[] str1 = s.split("[, ]");
        String[] str2 = s.split("[, ]");
        
        int sum =0,sum1=0;
        
        for (int i=0;i<str1.length;i+=2){
            if((str1[i]).equals(a)){
                int num = Integer.parseInt(str1[i+1]);
                sum = sum + num;
            }
            else if (!(str1[i]).equals(a)){
                int num1 = Integer.parseInt(str1[i+1]);
                sum1 = sum1+num1;
            }
            
        }
        System.out.println("Goals scored: " + sum);
        System.out.println("Goals conceded: " + sum1);
        
        int win=0, draw=0,loss=0;
        
        for (int i=1; i<str2.length; i+=4){
            if((((str2[i].compareTo(str2[i+2])>0)&&((str2[i-1]).equals(a))) || ((str2[i].compareTo(str2[i+2])<0) && ((str2[i-1].equals(a)))))){
                win++;
            }
            else if (str2[i].equals(str2[i+2])){
                draw++;
            }
            else
                loss++;
        }
        System.out.println("Number of wins: "+win);
        System.out.println("Number of defeats: "+ loss);
        System.out.println("Number of draws: "+ draw);
        
        int score=(win*3)+(draw);
        System.out.println("Number of points:" + score);
        
        //homegame
        int num2=0;
        for(int i=0;i<str1.length;i+=4){
            if(str1[i].equals(a)){
                num2++;
            }
        }
        System.out.println("Homegames:" +num2);
        
        //awaygame
        int num3=0;
        for(int i=2;i<str1.length;i+=4){
            if (str1[i].equals(a)){
                num3++;
            }
        }
        System.out.println("Awaygame:"+num3);
    }
    
}
