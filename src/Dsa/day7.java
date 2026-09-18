int n = nums.length;
int prev1 = nums[0];
int prev2 = Math.max(nums[0], nums[1]);

for(int i=2;i<n;i++) {
    int current = Math.max(prev2, prev1+nums[i]);
    prev1=prev2;
    prev2=current;
}
return prev2;


//coins

int n = coins.length;
int[] dp = new int[amount+1];

Arrays.fill(dp,amount+1);
dp[0] = 0;
for(int i=1;i<= amount;i++) {
    for(int coin: coins) {
        if(coin <= i){
            dp[i] = Math.min(dp[i],dp[i-coin]+1);
        }
    }
}
return dp[amount] > amount ? -1 : dp[amount];


//knapsaack

int n = weights.length;
int[][] dp = new int[n+1][capacity+1];
for(int i=1;i<=n;i++) {
    for(int w=1;w<=capacity;w++) {
        if(weights[i-1] <= w) {
            dp[i][w] = Math.max(dp[i-1][w], values[i-1]+dp[i-1][w-weights[i-1]]);
        } else {
            dp[i][w] = dp[i-1][w];
        }
    }
}
return dp[n][capacity];

