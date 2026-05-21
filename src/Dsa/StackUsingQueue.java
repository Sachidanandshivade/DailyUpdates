package Dsa;
import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {
    Queue<Integer> q =new LinkedList<>();
    void push(int data){
        q.offer(data);
        int size = q.size();
        for(int i=0;i<size-1;i++){
            q.offer(q.poll());
        }
        System.out.println(data + " pushed");
    }

    int peek() {
        if (q.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return q.peek();
    }
    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return q.poll();
    }
    boolean isEmpty() {
        return q.isEmpty();
    }
    void display() {
        System.out.println(q);
    }
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());
        s.display();
    }
}
