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


int prev1 = nums[0];
int prev2 = Math.max(prev1,nums[1]);

for(int i= 2;i<n;i++) {
    int current = Math.max(prev1,prev2+nums[i]);
    prev1 = prev2;
    prev2 = current;
}

return prev2;


//0/1 knapsack
int n = weights.length;
int[][] dp = new int[n+1][capacity+1];

for(int i=1;i<= n;i++){
    for(int w=1;w<= capacity;w++) {
        if(weights[i] <= w){
            dp[i][w] = Math.max(dp[i-1][w],values[i-1] + dp[i-1][w-weights[i-1]]);
        }else{
            dp[i][w] = dp[i-1][w];
        }
    }
}
return dp[n][capacity];


int n = weights.length;

int[] dp = new int[capacity+1];
for(int i=0;i<n;i++) {
    for(int w = capacity ; w >= weights[i];w--) {
        dp[w] = Math.max(dp[w], values[i]+dp[w-weights[i]]);
    }
}
return dp[capacity];



//

int n = arr.length;
boolean[][] dp = new boolean[n+1][target+1];

for(int i=0;i<=n;i++) {
    dp[i][0] = true;
}

for(int i=1;i<=n;i++) {
    for(int sum =1;sum <= target;sum++) {
        if (arr[i-1] <= sum) {
            dp[i][sum] = dp[i-1][sum]|| dp[i-1][sum-arr[i-1]];
        }else{
            dp[i][sum] = dp[i-1][sum];
        }
    }
}
return dp[n][target];



