public int candy(int[] ratings) {
    int n = ratings.length;
    int[] candies = new int[n];
    Arrays.fill(candies,1);

    for(int i=1;i<n;i++) {
        if(rating[i] > rating[i-1]) {
            candies[i] = candies[i-1]+1;
        }
    }

    for(int i = n-2;i>=0;i--) {
        if(rating[i] > rating[i+1]) {
            candies[i] = math.max(candies[i],candies[i+1]+1);
        }
    }

    int total = 0;
    for(int candy: candies) {
        total += candy;
    }
    return total;
}

//Allocate books

public static boolean canAllocate(int[] pages,int m , long limit) {
    int students = 1;
    long cp = 0;
    for(int page:pages) {
        if(cp+page <=limit) {
            cp += page;
        }else{
            student++;
            cp = page;
            if(student > m) {
                return false;
            }
        }
    }
    return true;
}

// ship , find the capacity

static long shipC(int n, int d, int[] weights) {
    long low = 0;
    long high = 0;
    for(int i=0;i<n;i++) {
        low = Math.max(low,weight[i]);
        high += weights[i];
    }
    long ans = high;

    while(low <= high) {
        long mid = low +(high-low)/2;

        if(canShip(weights,d,mid)) {
            ans = mid;
            high = mid-1;
        }else{
            low = mid+1;
        }
    }
    return answer;
}

static canShip(int[] weights, int d, long capacity) {
    int days = 1;
    long current = 0;
    for(int weight: weights) {
        if(current + weight <= capacity) {
            current += weight;
        }else{
            days++;
            current = weight;

            if(days > d) {
                return false;
            }
        }
    }
    return true;
}

//min Processing Speed

long low = 1;
long high = 0;

for(int pile:piles) {
    high = Math.max(high,pile);
}

long ans = high;
while(low<=high) {
    long mid = low+(high-low) / 2;
    if(canF(piles,h,mid)){
        ans = mid;
        high = mid-1;
    }else{
        low = mid+1;
    }
    return ans;
}

private static boolean canF(int[] oiles, long h, long k) {
    long totalHours = 0;
    for(int pile:piles) {
        totalHours += (pile + k-1)/k;
        if(totalHours > h) {
        return false;
        }
    }
    return totalHours <= h;
}