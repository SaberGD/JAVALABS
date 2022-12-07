package com.mycompany.lab3;
import java.util.Scanner;

public class releaseCommas {
    
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your Sentence with commas ");
        String line = input.nextLine();
        line = line.replace(",","");
        System.out.println("-----------------------------------------------------------");
        System.out.print(" here is the line without commas: \n" + line );
 }}
