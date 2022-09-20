package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rowSize = scan.nextInt();
        int[][] arr = new int[rowSize][];

        for (int i=0; i<rowSize; i++){
            int columnSize = scan.nextInt();
            arr[i] = new int[columnSize];
            for(int j=0; j<columnSize; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int queryCount = scan.nextInt();
        for (int i=0; i<queryCount; i++){
            int rowNumber = scan.nextInt();
            int columnNumber = scan.nextInt();
            try{
                System.out.println(arr[rowNumber-1][columnNumber-1]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
