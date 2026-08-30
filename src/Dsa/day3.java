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

