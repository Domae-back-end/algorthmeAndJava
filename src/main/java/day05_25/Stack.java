package day05_25;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            String row = sc.next();
            java.util.Stack<Character> stack = new java.util.Stack<>();

            for (int j = 0; j < row.length(); j++) {

                if (row.charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        stack.push(row.charAt(j));
                    } else {
                        if (stack.peek() == '(') stack.pop();
                        else stack.push(row.charAt(j));
                    }
                }
// '(' 일 때,
                else {
                    stack.push(row.charAt(j));
                }
            }
//stack 확인
            if (stack.isEmpty()) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
