package main.java;

import java.util.HashMap;
import java.util.Scanner;

public class Solution17 {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        HashMap<String, Integer> listaTelefone = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            listaTelefone.put(name, phone);
        }

        while(in.hasNext())
        {
            String s=in.nextLine();
            if (listaTelefone.get(s) != null){
                System.out.println(s + "=" + listaTelefone.get(s));
            } else { // If not, then print "Not found"
                System.out.println("Not found");
            }
        }
    }
}
