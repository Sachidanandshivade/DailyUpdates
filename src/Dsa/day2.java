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

