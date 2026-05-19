package Dsa;

public class Queue {
    int arr[];
    int front;
    int rear;
    int size;
    Queue(int size){
        this.size = size;
        arr = new int[size];
        front =0;
        rear = -1;
    }
    boolean isEmpty(){
        return rear<front;
    }
    boolean isFull(){
        return rear== size-1;
    }

    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear]= data;
        System.out.println("inserted");
    }

    int dequeue(){
        if (isEmpty()) {

            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];

        front++;

        return value;
    }
    int peek() {

        if (isEmpty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        return arr[front];
    }
    void display() {

        if (isEmpty()) {

            System.out.println("Queue Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();

        System.out.println("Front: " + q.peek());
    }
}
