package Dsa;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new RuntimeException("Stack is empty!");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Stack is empty!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack minStack = new MinStack();

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        System.out.println("Operations:");
        System.out.println("1 x → push x");
        System.out.println("2   → pop");
        System.out.println("3   → top");
        System.out.println("4   → getMin");

        for (int i = 0; i < n; i++) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int val = sc.nextInt();
                    minStack.push(val);
                    break;

                case 2:
                    minStack.pop();
                    break;

                case 3:
                    try {
                        System.out.println("Top: " + minStack.top());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Min: " + minStack.getMin());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }

        sc.close();
    }
}