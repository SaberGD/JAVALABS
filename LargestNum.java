// A program to find the largest number on array

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please Enter the number Of array elements");
        int n= in.nextInt();
        double [] ARR = new double[n];
        for (int i=0 ; i<n ; i++){
            System.out.println("Please Enter the element number " + (i+1) );
            ARR [i]= in.nextInt();
        }
        double largest = ARR[0];
        for (int i=0; i<n ;i++ ){
            if (largest < ARR[i]){
            largest = ARR [i];
                    }
        }
        System.out.println("The Largest Num in the array is : " + largest);
    }
}
