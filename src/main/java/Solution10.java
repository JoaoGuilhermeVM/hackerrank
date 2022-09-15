package main.java;

import java.io.*;
import java.util.*;

public class Solution10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();
        if(B>=1 && H>=1){
            System.out.println(B * H);
        } else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
