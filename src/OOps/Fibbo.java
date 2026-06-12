package OOps;

import java.util.Scanner;

public class Fibbo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The first " + n + " Fibonacci numbers are:");
        Cal calculator = new Cal();
        calculator.fib(n);
        scanner.close();
    }
}

class Cal {
    public void fib(int n) {
        // Base case: if user wants 0 or fewer numbers, do nothing
        if (n <= 0) {
            return;
        }

        // Initialize the first two numbers of the Fibonacci series
        int first = 0;
        int second = 1;

        // Count tracks how many numbers we have printed so far
        int count = 0;

        // Use a while loop to generate Fibonacci numbers until n numbers are found
        while (count < n) {
            System.out.println(first);

            // Calculate the next Fibonacci number
            int next = first + second;

            // Shift values for the next iteration
            first = second;
            second = next;

            count++;
        }
    }
}
