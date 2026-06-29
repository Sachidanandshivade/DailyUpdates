package Dsa;

import java.util.Scanner;

public class Sliding {
        public static long maximumSumWindow(int n, int[] arr, int k) {
            if (n < k) return -1;

            long windowSum = 0;
            // Step 1: Compute the sum of the first window of size K
            for (int i = 0; i < k; i++) {
                windowSum += arr[i];
            }

            long maxi = windowSum;

            // Step 2: Slide the window from index K to N-1
            for (int i = k; i < n; i++) {
                // Add the new element entering the window (arr[i])
                // and remove the old element leaving the window (arr[i - k])
                windowSum = windowSum + arr[i] - arr[i - k];

                // Track the maximum sum seen so far
                maxi = Math.max(maxi, windowSum);
            }

            return maxi;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(maximumSumWindow(n, arr, k));
        }

}
