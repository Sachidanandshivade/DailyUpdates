int[] sum = new int[arr.lenght];
sum[0] = arr[0];
for(int i=1; i< arr.length;i++) {
    sum[i] = sum[i-1] + arr[i];
}
return sum;


int[] prefix = new int[n];
prefix[0] = arr[0];

for(int i=1;i<n;i++) {
    prefix[i] = prefix[i-1] + arr[i];
}

for(int i=0;i<m;i++) {
    int l = query[i][0];
    int r = query[i][1];

    if( l == 0) {
        return prefix[r];
    }  else{
        return prefix[r] - prefix[l-1];
    }
}


int totalSum = 0;
int Lsum = 0;

for(int i=0;i<n;i++) {
    total += arr[i];
}

for(int i=0;i<n;i++) {
    int Rsum = total -Lsum - arr[i];
    if(Lsum == Rsum){
        return i;
    }
    Lsum += arr[i];
}

return -1;


HashMap<Integer,Integer> map = new HashMap<>();
for(int num: arr) {
    if(map.contains(k-num)) {
        return "YES";
    }
    map.put(num, map.getOrDefault(num,0)+1);
}
return "NO";


int sum = 0;
HashSet<Integer> set = new HashSet<>();
for(int num: arr) {
    sum += num;
    if(set.contains(sum - k)){
        return "YES";
    }
    set.add(sum);
}
return "NO";


HashMap<Integer,Integer> map = new HashMap<>();

int count = 0;
int cSum = 0;
for(int i=0;i<n;i++) {
    cSum += arr[i];
    if(cSum == 0) {
        count++;
    }
    if(map.contains(cSum)){
        count += map.get(cSum);
    }
}




//Sliding window
long wSum =0;

if(n<k) return -1;

for(int i=0;i<k;i++) {
    wSum += arr[i];
}

for(int i=0; i<n-k;i++) {
    wSum = wSum - arr[i] + arr[i+k];
    max = Math.max(max,wSum);
}

return max;


wSum = 0;
for(int i=0;i<n;i++) {
    wSum += arr[i];
}

double avg = wSum/k;
for(int i =0; i<n-k;i++){
    wSum = wSum-arr[i]+arr[i+k];
    avg = Math.max(avg,wSum/k);
}

return avg;


int wSum = 0;
int left = 0;
minL = Integer.MAX_VALUE;
for(int i=0;i<n;i++) {
    wSum += arr[i];

    if(wSum >= target) {
        minL = Math.min(minL,i-left+1);
        wSum -= arr[left];
        left++;
    }
}

return minL == Integer.MAX_VALUE?0:minLength;


long[] result = new long[n-k+1];
int idx = 0;
Deque<Integer> deque = new LinkedList<>();
for(int i=0;i<k;i++) {
    if(arr[i]<0) {
        dequeue.addLast(i);
    }
}

if(!deque.isEmpty()) {
    result[idx++] = arr[dequeu.peekFirst()];
}else{
    result[idx++] = 0;
}

HashSet<Character,Integer> set = new HashSet<>();
int max = 0;
int left = 0;

for(int right=0; right < s.length();right++) {
    char ch = s.charAt(right);
    while(set.contains(ch)) {
        set.remove(s.charAt(left));
        left++;
    }
    set.add(ch);
    max = Math.max(max,right-left+1);
}
return max;

