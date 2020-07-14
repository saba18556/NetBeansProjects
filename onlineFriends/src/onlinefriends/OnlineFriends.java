package onlinefriends;

import java.util.Scanner;

public class OnlineFriends {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of friends ");
        int size = in.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter the names of your friends ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.next();
        }
        Boolean[] arr1= new Boolean[size];
        System.out.println("Enter true or false for online or offline friends");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextBoolean();
        }
        String[] arr2= new String[size];
        boolean s1 = true;
        int counter=0;
        for (int i=0;i<arr1.length;i++){
            if(s1==arr1[i]){
                counter++;
            }
       
        }
        int k=0;
        while (k<counter){
            for (int i=0;i<arr.length;i++){
                if (s1==(arr1[i])){
                    arr2[k]=arr[i];
                    k++;
                }
            }
        }
        System.out.println("Friends who are online");
        for (int i=0;i<arr2.length;i++){
            if(arr2[i]!=null)
                System.out.println(arr2[i]);
        }
        
    }
    
}
