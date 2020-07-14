/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcharacter;

/**
 *
 * @author Saba fatima
 */
public class Randomcharacter{
Char[] chars = createArray();

       //Display the array
       System.out.println("The lowercase letters are:");
       displayArray(chars);

       //Count the occurences of each letter
       int[] counts = countLetters(chars);

       //Displahy counts
       System.out.println();
       System.out.println("The occurences of each letter are:");
       displayCounts(counts);        
   }

   /*Create an array of characters*/
   public static char[] createArray() {
       //Declare an array of characters and create it
       char[] chars = new char[100];

       //Create lower case letters randomly and assign
       //them to the array
       for (int i = 0; i < chars.length; i++)
           chars[i] = (char)('a' + Math.random() * ('z'- 'a' + 1));

       //Return the array
       return chars;
   }

   public static void displayArray(char[] chars) {
       //Display characters in the array 20 on each line
       for (int i = 0; i < chars.length; i++) {
           if ((i + 1) % 20 == 0)
               System.out.println(chars[i]);
           else 
               System.out.print(chars[i] + " ");
       }
   }
       // Count the occurences of each letter
       public static int[] countLetters(char[] chars) {
           //Declare and create an array of 26 int
           int[] counts = new int[26];

           //For each lower case letter in the array, count it
           for (int i = 0; i < chars.length; i++)
               counts[chars[i] - 'a']++;

           return counts;
       }
       /*Display counts/
       public static void displayCounts(int[] counts) {
           for (int i = 0; i < counts.length; i++) {
               if ((i + 1) % 10 == 0)
                   System.out.print((counts[i] + " " + (char)(i + 'a')));
               else
                   System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
           }
       }
}