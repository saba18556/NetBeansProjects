package camelcase;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String s = in.nextLine();
        System.out.println("Number of words are "+ Camelcase(s));
    }
    public static int Camelcase(String s){
        String[] str = s.split("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        int n = str.length;
        return n;
    }
    }
    

