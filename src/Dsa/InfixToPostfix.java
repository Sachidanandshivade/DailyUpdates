package Dsa;

import java.util.Stack;

public class InfixToPostfix {
    static int precedence(char ch){
        if(ch == '^'){
            return 3;
        }else if(ch == '*' || ch =='/'){
            return 2;
        } else if (ch =='+' || ch=='-') {
            return 1;
        }
        return -1;
    }

    static String infixPostfix(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            } else if (ch =='(') {
                stack.push(ch);
            } else if (ch==')') {
                while(!stack.isEmpty() && stack.peek()!= '('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {

                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek())) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {

            result.append(stack.pop());
        }

        return result.toString();
    }

public static void main(String[] args) {

    String s = "A+B*C";

    String postfix = infixPostfix(s);

    System.out.println("Postfix Expression: " + postfix);

    }
}
