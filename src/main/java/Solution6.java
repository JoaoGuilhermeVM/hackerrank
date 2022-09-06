package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());


        for (int i = 1; i <= 10; i++) {
            System.out.print(N + " x " + i + " = ");
            System.out.println(N * i);
        }
        bufferedReader.close();
    }
}


