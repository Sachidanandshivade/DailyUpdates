package Dsa;
import java.util.*;

public class CoinChange {

    public static int coinChange1(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    // Coin Change II - Number of Ways
    public static int coinChange2(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {

            for (int j = coin; j <= amount; j++) {

                dp[j] += dp[j - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};

        // Coin Change I
        int amount1 = 11;
        int minCoins = coinChange1(coins, amount1);
        System.out.println("Coin Change I (Minimum Coins): " + minCoins);

        // Coin Change II
        int amount2 = 5;
        int ways = coinChange2(coins, amount2);
        System.out.println("Coin Change II (Number of Ways): " + ways);
    }



}
