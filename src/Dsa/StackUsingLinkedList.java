package Dsa;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLinkedList {
    Node top;

    void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("stack underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek(){
        if(top == null) return -1;
        return top.data;
    }

}
