
package com.mycompany.lab1task2ncrnpr;
import java.util.Scanner;

public class NCRNPR {
  public static int fact(int num){
    int fact=1, i;
    for(i=1; i<=num; i++){
        fact = fact*i;
    }
    return fact;
  }
    
    public static void main(String[] args) {
      int n, r , ncr , npr ;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of n: ");
      n = scanner.nextInt();
        System.out.println("Please enter the value of r :");
      r = scanner.nextInt();
      ncr = (fact(n)/(fact(n-r)*fact(r)));
      npr = (fact(n)/(fact(n-r)));
      System.out.println("NCR is  = " + ncr) ;
      System.out.println("NPR is = " + npr);
    }
}

