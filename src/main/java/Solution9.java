package main.java;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        int lines = 1;
        while (scan.hasNextLine()){
            System.out.println(lines++ + " " + scan.nextLine());
        }
    }
}