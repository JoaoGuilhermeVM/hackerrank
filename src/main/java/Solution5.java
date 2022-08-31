package main.java;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            for (int s=s1.length();s<15; s++){
                s1 += " ";
            }
            System.out.println(s1.concat(String.format("%03d",x)));
        }
        System.out.println("================================");

    }
}

