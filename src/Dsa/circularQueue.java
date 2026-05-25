package Dsa;

class circularQueue {

    int arr[];
    int front;
    int rear;
    int size;

    circularQueue(int size) {

        this.size = size;

        arr = new int[size];

        front = -1;
        rear = -1;
    }

    // Check empty
    boolean isEmpty() {

        return front == -1;
    }

    // Check full
    boolean isFull() {

        return (rear + 1) % size == front;
    }

    // Enqueue
    void enqueue(int data) {

        if (isFull()) {

            System.out.println("Queue Full");
            return;
        }

        // First element
        if (front == -1) {

            front = 0;
        }

        rear = (rear + 1) % size;

        arr[rear] = data;

        System.out.println(data + " inserted");
    }

    // Dequeue
    int dequeue() {

        if (isEmpty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        int value = arr[front];

        // Single element case
        if (front == rear) {

            front = -1;
            rear = -1;
        }

        else {
            front = (front + 1) % size;
        }

        return value;
    }

    // Peek
    int peek() {

        if (isEmpty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        return arr[front];
    }

    // Display queue
    void display() {

        if (isEmpty()) {

            System.out.println("Queue Empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % size;
        }

        System.out.println();
    }



    public static void main(String[] args) {

        circularQueue q = new circularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }
}