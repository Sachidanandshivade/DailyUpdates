package Dsa;

public class StackImplementaion {
  int[] arr ;
  int top;
  int capacity;

   StackImplementaion(int size){
       arr = new int[size];
       capacity=size;
       top = -1;
   }

   void push(int x){
       if(top == capacity-1){
           System.out.println("Stack overflow");
           return;
       }
       arr[top++] = x;
   }

   int pop(){
       if(top == -1){
           System.out.println("System underflow");
           return -1;
       }
       return arr[top--];
   }

   int peek(){
       if(top == -1){
           return -1;
       }
       return arr[top];
   }

   boolean isEmpty(){
       return top == -1;
   }
}
