package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp;

        List<Integer> array = new ArrayList<>();

        for (int i=0; i<num; i++){
            temp = scan.nextInt();
            array.add(temp);
        }

        int l = scan.nextInt();
        for (int i=0; i<l; i++){
            if (l > 1){
                String Q = scan.next();
                if(Q.equalsIgnoreCase("Insert")){
                    int new_index_insert = scan.nextInt();
                    int new_valuer_insert = scan.nextInt();
                    array.add(new_index_insert,new_valuer_insert);
                }

                if (Q.equalsIgnoreCase("Delete")){
                    int removeIndex = scan.nextInt();
                    array.remove(removeIndex);
                }
            }
        }
        array.forEach(x -> System.out.print(x+" "));
    }
}
