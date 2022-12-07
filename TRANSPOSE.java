package TASK2;
import java.util.Scanner;
public class TRANSPOSE {
    static Scanner in = new Scanner (System.in);
        public static void main(String args [] ){
        int [][]array = new int[3][3];
        fillarray(array);
        printarray(array);
        transpose(array);
    }
        public static void fillarray(int [] [] list){
        for( int row = 0 ; row < list.length ; row ++ )
            for (int col=0 ;col < list[0].length;col++){
                System.out.println("enter data for row number: "+row +" and column number: "+col);
                list[row][col]=in.nextInt();
    }
}
        public static void printarray(int [] [] list){
            System.out.println("the two dimensional array structure is:");
            for ( int row = 0 ; row < list.length ; row ++ ){
                for (int col=0 ;col < list[0].length;col++){
                    System.out.print(list[row][col]);
                }
                System.out.println();
}

}
        public static void transpose(int [][]list){
        System.out.println("the transpose of array structure is:");

            for ( int row = 0 ; row < list.length ; row ++ ){
                for (int col=0 ;col < list[0].length;col++){
                    System.out.print(list[col][row]);
                }
                System.out.println();
            
        }
}
}