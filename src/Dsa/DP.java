package Dsa;

public class DP {
    public static boolean subsetSum(int[] arr, int target) {
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int index = n - 1; index >= 0; index--) {
            for (int t = 1; t <= target; t++) {
                boolean take = false;
                if (arr[index] <= t) {
                    take = dp[index + 1][t - arr[index]];
                }
                boolean notTake = dp[index + 1][t];
                dp[index][t] = take || notTake;
            }
        }

        return dp[0][target];
    }
    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 8, 10};
        int target = 11;

        boolean ans = subsetSum(arr, target);

        System.out.println("Can we form target? " + ans);
    }
}
