HashSet<Integer> map = new HashSet<>();

int max = 0;
int left = 0;

for(int right=0;i<right.length();right++) {
    char ch = s.charAt(right);
    while(map.contains(ch)) {
        map.remove(s.charAt(ch));
        left++;
    }
    set.add(ch);
    max = Math.max(max,right-left+1);

}
return max;

HashSet<Integer> set = new HashSet<>();

for(int i=0;i<n;i++) {
    int sum = target-arr[i];
    if(set.contains(sum)){
        return "Yes";
    }
    set.add(sum);
}

return "NO";

int left = 0;
int right = n-1;

while(left< right) {
    long cSum = (long)arr[left] + arr[right];

if(cSum == target) {
    return "Yes";
}else if(cSum  < target) {
    left++;
}else{
    right++;
}
}

return "NO";


//k distinct character 
if(s==null || s.length() == 0) {
    return 0;
}

HashMap<Character,Integer> map = new HashMap<>();

int max = 0;
int left = 0;

for(int right=0; right< s.length(); right++){
    char c = s.charAt(i);
    map.put(c,map.getOrDefault(num,0)+1);

    while(map.size() > k) {
        char lc = s.charAt(left);
        map.put(lc,map.get(lc)-1);

        if(map.get(lc) == 0){
            map.remove(lc);
        }
        left++;
    }
    max = Math.max(max, right-left+1);
}

// merge two sorted arrays

int i = n-1;
int j = m-1;
int k = n+m-1;

while( i >= 0 && j >= 0) {
    if(arr1[i] > arr2[j]) {
        arr1[k--] = arr1[i--];
    }else{
        arr1[k--] = arr2[j--];
    }
}

while(j>= 0) {
    arr1[k--] = arr2[j--];
}


// container with most water

int left = 0;
int right = n-1;

while(left<right){
int Lh = arr[left];
int Rh = arr[right];
int height = Math.min(Lh,Rh);

maxArea = Math.max(maxArea,(right-left)*height);
while(left<right && arr[left] <= Height){
left++;
}
while(left<right %% arr[right] <= Height) {
    right++;
}

}
return max;


//triplet closet sum

Arrays.sort(arr);
int closetSum = arr[0] + arr[1] + arr[2];
for(int i=0; i<n-2;i++) {
    int left = i+1;
    int right = n-1;

    while(left<right) {
        int cSum = arr[i]+arr[left]+arr[right];

        if(cSum == target) {
            return cSum;
        }

        while(Math.abs(target-cSum) < math.abs(target-closestSum)) {
            closetSum = (int) cSum;
        }

        if(cSum < target) {
            left++
            while(left<right && arr[left] == arr[left-1]){
                left++;
            }
        }else{
            right--;
            while(left < right && arr[right] == arr[right + 1]) {
                        right--;
        }
    }
}
return closetSum;

//triplet whose sum is 0

List<List<Integer>> result = new ArrayList<>();
Arrays.sort(arr);
for(int i=0;i<n-2;i++){
    if(i>0 && arr[i] == arr[i-1]) {
        continue;
    }

    int left = i+1;
    int right = n-1;
    while(left< right) {
        innt su
    }
}


// count pair whose difference less than k
Map<Integer,Long> map = new HashMap<>();
for(int num: arr) {
    map.put(num,map.getOrDefault(num,0L)+1);
}

long count = 0;

for(int num:map.keySet()) {
    if(k == 0) {
        long freq = map.get(num);
        count += freq * (freq-1)/2
    }else {
                if (map.containsKey(num + k)) {
                    count += map.get(num) * map.get(num + k);
                }
    }
}

return count;


//Recursion and backtracking 
// lexicographical order

public static List<String> generatePermutation(String s) {
    List<String> result = new ArrayList<>();
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    
    boolean[] visited = new booleab[chars.length];
    backtrack(chars,visited,new StringBuilder(), result);
    return result;
}

private static void backtrack(char[] chars, boolean[] visited, StringBuilder current, List<String> result) {
    if(current.length() == chars.length) {
        result.add(current.toString())
        return;
    }

    for(int i=0;i<chars.length;i++) {
        if(visited[i]){
            continue;
        }
        visited[i] = true;
        current.append(chars[i]);
        backtrack(chars,visited,current,result);
        current.deleteCharAt(current.length()-1);
        visited[i] = false;
    }
}


// stairs 
if(n==1) {
    return 1;
}
if(n==2) {
    return 2;
}

long[] dp = new long[n+1];
dp[1] = 1;
dp[2] = 2;
for(int i=3;i<=n;i++) {
    dp[i] = dp[i-1] + dp[i-2];
}
return dp[n];

// adjusant house robbery

if(n==0) return 0;
if(n==1) return arr[0];

long[] dp = new long[n];
dp[0] = 0;
dp[1] = Math.max(arr[0], arr[1]);
for(int i=2;i<n;i++) {
    dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]);
}
return dp[n-1];


// training tower

long[] dp = new long[n+1];
dp[0] = 0;
dp[1] = 0;
for(int i=2;i<=n;i++) {
    dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
}
return dp[n];

// coin 
int[] dp = new int[amount+1];
Arrays.fill(dp,amount+1);
dp[0] = 0;
for(int i=0;i<n;i++) {
    int coin = coins[i];
    for(int j = coin; j<= amount;j++){
        dp[j]= Math.min(dp[j],dp[j-coin]+1);
    }
}

if(n == 0)  return 0;
if(n == 1) return Math.max(0,arr[0]);
long[] dp = new long[n];
dp[0] = Math.max(0,arr[0]);
dp[1] = Math.max(dp[0],(long)arr[1]);
for(int i=2;i<n;i++) {
    dp[i] = math.max(0,Math.max(arr[i] + dp[i-2],dp[i-1]));
}
return dp[n-1];

// subset sum 
public static String subsetSum(int n, int k, int[] arr) {
    boolean[] dp = new boolean[k+1];
    dp[0] = true;

    for(int val: arr) {
        for(int target = k; target >= value; target--) {
            if(dp[target-value]) {
                dp[target] = true;
            }
        }
    }
    return dp[k]?"YES":"NO";
}

public static int longestss(string s1, String s2) {
    int m = s1.length();
    int n = s2.lenght();

    int[][] dp = new int[m+1][n+1];
    for(int i=1;i<=m;i++) {
        for(int j=1;j<= n;j++) {
            if(s1.charAt(i-1) == s2.charAt(j-1) ){
                dp[i][j] = 1+ dp[i-1][j-1];
            }else{
                dp[i][j] = Math.max(dp[i-1][j] ,dp[i][j-1]);
            }
        }
    }
    return dp[m][n];
}

//non overlapping

Arrays.sort(meeting,(a,b)-> Integer.compare(a[1],b[1]));
int count = 0;
int last = -1;
for(int i=0;i<n;i++) {
    if(meetings[i][0] >= last) {
        count++;
        last = meeting[i][1];
    }
}
return count

// countSubset

int MOD = 100000007;
int[] dp = new int[k+1];
dp[0] = 1;
for(int score: arr) {
    for(int j=k;j>= score;j--) {
        dp[j] = (dp[j] + dp[j-score])%MOD;
    }
}
return dp[k];