static int fib(int n) {
    if(n <= 1){
        return n;
    }
    return fib(n-1)+fib(n-2);
}


static int fib(int n) {
    if(n<=1){
        return n;
    }

    int[] dp = new int[n+1];

    dp[0] = 0;
    dp[1] = 1;

    for(int i=2;i<=n;i++){
        dp[i] = dp[i-1]+dp[i-2];
    }
    return dp[n];
}


int prev1 = 1;
int prev2 = 2;

for(int i=3;i<=n;i++) {
   int current = prev1 + prev2;
    prev1 = prev2;
    prev2 = current;
}
return prev2;


int[] dp = new int[n+1];

dp[0] = nums[0];
dp[1] = Math.max(nums[0],nums[1]);

for(int i=2; i<= n;i++) {
    dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
}
return dp[n];
