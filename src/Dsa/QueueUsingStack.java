package Dsa;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int data){
        s1.push(data);
        System.out.println(data +"inserted");
    }

    int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            return -1;
        }
        if(s2.isEmpty()){
            s2.push(s1.pop());
        }
        return s2.pop();
    }
    int peek() {

        if (s1.isEmpty() && s2.isEmpty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        if (s2.isEmpty()) {

            while (!s1.isEmpty()) {

                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }
    void display(){
        if (s1.isEmpty() && s2.isEmpty()) {

            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Stack1: " + s1);
        System.out.println("Stack2: " + s2);
    }
    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Front: " + q.peek());

        q.display();
    }
}
