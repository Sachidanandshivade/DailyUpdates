package Dsa;

import java.util.Scanner;
import java.util.Stack;



public class ValidParentheses {

    public static Boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch =='{' || ch== '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean result = isValid(input);

        if(result){
            System.out.println("valid parentheses");
        }else{
            System.out.println("Invalid Parentheses");
        }
        sc.close();
    }
}
