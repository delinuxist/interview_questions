package org.example;

public class DayThree {
    public static void main(String[] args) {
        String[] arr = new String[6];
        Stack<String> stack = new Stack<>(arr);

        stack.push("hello");
        stack.push("sam");
        stack.push("jim");

        stack.printStack();

        System.out.print("Peek");
        String val = stack.peek();
        System.out.println(": "+ val);
        System.out.print("Popping");
        String val2 = stack.pop();
        System.out.println(": "+ val2);
        stack.printStack();
    }
}