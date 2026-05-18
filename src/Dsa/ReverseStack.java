package Dsa;

import java.util.Stack;

public class ReverseStack {

    static void insertAtBottom(Stack<Integer>st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int top =st.pop();

        insertAtBottom(st,data);

        st.push(top);


    }

    static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);

        insertAtBottom(st,top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack: " + st);

        reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}
