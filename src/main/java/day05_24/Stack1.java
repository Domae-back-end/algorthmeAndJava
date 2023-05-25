package day05_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {

            String input = reader.readLine();

            if (input.contains("push")) { //push 5
                stack.push(Integer.parseInt(input.split(" ")[1]));
            } else if (input.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.get(stack.size() - 1));
                }
            } else if (input.equals("size")) {
                System.out.println(stack.size());
            } else if (input.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (input.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            }

        }

    }
}
