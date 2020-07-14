
package towerofhanoi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int disk = 0;
        try {
            disk = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
        if (disk == 0) {
            System.out.println("Enter the valid number");
        } else {
            int[][] arr1 = new int[disk][3];

            for (int i = 0; i < disk; i++) {
                arr1[i][0] = i + 1;

            }
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.print(" | " + arr1[i][j] + " |");
                }
                System.out.println("");
            }
            boolean check = false;
            while (check != true) {
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i][2] == i + 1) {
                        check = true;
                        continue;
                    } else {
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    System.out.println("You Won!!");
                    break;
                }
                System.out.println("Enter from: (1<=number<=3)");
                int from = 0;
                try {
                    from = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("invalid input");
                    break;
                }
                if (from > 3 || from < 1) {
                    System.out.println("Invalid entry");
                }
                System.out.println("Enter to: (1<=number<=3)");
                int to = 0;
                try {
                    to = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("invalid input");
                    break;
                }
                if (to > 3 || to < 1) {
                    System.out.println("Invalid entry");
                    continue;
                }

                boolean loop_value = false;
                boolean loop_value2 = false;
                boolean loop_value3 = true;
                int temp = 0;

                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i][from - 1] != 0) {
                        temp = arr1[i][from - 1];
                        loop_value = true;
                        for (int j = arr1.length - 1; j > 0; j--) {
                            if (temp > arr1[j][to - 1] && arr1[j][to - 1] != 0) {
                                loop_value3 = false;
                                break;
                            }
                        }
                        if (loop_value3 == false) {
                            break;
                        }
                        arr1[i][from - 1] = 0;
                    }
                    if (loop_value == true) {
                        break;
                    }
                }

                if (loop_value3 == false) {
                    System.out.println("Invalid! The number is greater!");
                    continue;
                }

                for (int i = arr1.length - 1; i >= 0; i--) {
                    if (arr1[i][to - 1] == 0) {

                        arr1[i][to - 1] = temp;
                        loop_value2 = true;
                    }
                    if (loop_value2 == true) {
                        break;
                    }
                }

                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                        System.out.print(" | " + arr1[i][j] + " | ");
                    }
                    System.out.println("");
                }

            }
        }

    }}

    


    
    

