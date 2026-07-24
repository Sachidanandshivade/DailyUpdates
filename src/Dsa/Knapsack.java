package Dsa;

public class Knapsack {
    public static int solution(int[] weight,int[] value,int capacity){
     int n = weight.length;
     int[] dp = new int[capacity+1];
     for(int index = n-1;index >= 0;index--) {
         for(int cap = capacity ; cap >= 0 ;cap-- ) {
             int take = 0;
             if(weight[index] <= cap) {
                 take = value[index] + dp[cap-weight[index]];
             }
             int not_take = dp[cap];
             dp[cap] = Math.max(take,not_take);
         }
     }
     return dp[capacity];
    }

    public static int undoundecKnapsack(int[] weight, int[] value, int capacity) {
        int n = weight.length;
        int[][] dp = new int[n+1][capacity+1];
        for(int cap = 0; cap <= capacity ; cap++) {
            dp[n][cap] = 0;
        }
        for(int index = n-1;index >= 0;index--) {
            for(int cap = capacity-1; cap >= 0; cap--) {
                int take = 0;
                if(weight[index] <= cap) {
                    take = value[index] + dp[index][cap - weight[index]];
                }

                int not_take = dp[index+1][cap];
                dp[index][cap] = Math.max(take,not_take);

            }
        }
        return dp[0][capacity];
    }

    public static void main(String[] args) {
        int[] weight = {2,3,4,5};
        int[] value = {4,5,7,8};
        int capacity = 5;
        System.out.println("Maximum value = " + solution(weight,value,capacity));
    }
}


