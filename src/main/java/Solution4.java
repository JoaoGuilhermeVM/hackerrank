package main.java;

import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Para que o nextInt(); não interfira com nossa String, utilizamos essa linha
        String s = scan.nextLine();

        System.out.println("String: " + s );
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}