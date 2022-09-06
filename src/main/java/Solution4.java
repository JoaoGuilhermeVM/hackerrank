package main.java;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Solution4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Para que o nextInt(); não interfira com nossa String, utilizamos essa linha
        String s = scan.nextLine();

        Logger logger
                = Logger.getLogger(
                Solution4.class.getName());

        logger.log(Level.INFO,"String: {}", s );
        logger.log(Level.WARNING,"Double: {}", d);
        logger.log(Level.SEVERE,"Int: {}", i);
    }
}