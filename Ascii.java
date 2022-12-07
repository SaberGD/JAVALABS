/*
1st Task Program to find  and  prints  the  character  whose  ASCII  value will get entered by user at run-time.
*/
package com.mycompany.lab1task1ascii;
import java.util.Scanner;
public class Ascii {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter the ASCII Value: ");
            int ascii = scan.nextInt();
            char ch = (char)ascii;
        System.out.println("\nThe character is \'"+ch+ "\'");
    }
}

