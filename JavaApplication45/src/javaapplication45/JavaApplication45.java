/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author Saba fatima
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static char randomChar(char a,char b){
        return (char)(a+Math.random()*(b-a+1));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int j, i=100;
        for(j=0;j<100;j++){
            char c=JavaApplication45.randomChar('a', 'z');
            System.out.println(c);
        }
        
    }
    
}
