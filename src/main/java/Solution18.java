package main.java;

import java.util.Scanner;
import java.util.Stack;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()){
            Stack<Character> stack = new Stack<>();
            String entrada = scan.next();
            char[] simbolos = entrada.toCharArray();

            for (char simbolo : simbolos){
                if (!stack.isEmpty()){
                    if (simbolo == '}' && stack.peek() == '{'){
                        stack.pop();
                    } else if (simbolo == ')' && stack.peek() == '('){
                        stack.pop();
                    } else if (simbolo == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(simbolo);
                    }
                } else {
                    stack.push(simbolo);
                }
            }
            System.out.println(stack.empty());
        }
        scan.close();
    }

}
