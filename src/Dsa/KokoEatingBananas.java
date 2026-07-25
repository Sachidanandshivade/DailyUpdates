package Dsa;

public class KokoEatingBananas {
    public static boolean canFinish(int[] piles,int h , int speed) {
        int hours = 0;
        for(int pile : piles) {
            hours += (pile+speed-1)/speed;
            if(hours > h) {
                return false;
            }
        }
        return true;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile: piles) {
            high = Math.max(high,pile);
        }
        int ans = -1;
        int mid = low+(high-low)/2;
        if(canFinish(piles,h,mid)) {
            ans = mid ;
            high = mid-1;
        }else{
            low = mid+1;
        }
        return ans;
    }

    public static void main(String[] ans) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(piles,h));
    }
}
