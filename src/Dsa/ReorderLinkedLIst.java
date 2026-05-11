package Dsa;

import java.util.Scanner;

public class ReorderLinkedLIst {
        public static void reorder(Node head){
            if(head == null || head.next == null){
                return;
            }

            Node slow = head;
            Node fast = head;

            while(fast.next!= null && fast.next.next != null){
                slow= slow.next;
                fast = fast.next.next;
            }

            Node second = slow.next;
            slow.next = null;

            Node prev = null;

            while(second!= null){
                Node next = second.next;
                second.next = prev;
                prev = second;
                second = next;
            }

            Node first = head;
            second = prev;

            while(second != null){
                Node temp1 = first.next;
                Node temp2 = second.next;

                first.next = second;
                second.next = temp1;

                first = temp1;
                second = temp2;
            }
            }
    public static void printList(Node head) {

        while (head != null) {

            System.out.print(head.data);

            if (head.next != null) {
                System.out.print(",");
            }

            head = head.next;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] arr = input.split(",");


        Node head = new Node(Integer.parseInt(arr[0]));
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {

            temp.next = new Node(Integer.parseInt(arr[i]));
            temp = temp.next;
        }

        reorder(head);

        printList(head);
    }

    }
