package Dsa;

public class CapacityToShip {

    static boolean canShip(int[] weights,int days, int limit) {
        int dayCount = 1;
        int currentW = 0;
        for(int weight: weights) {
            if (currentW + weight <= limit) {
                currentW += weight;
            } else {
                dayCount++;
                currentW = weight;

                if(dayCount > days){
                    return false;
                }
            }
        }
        return true;
    }

    static int shipwDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight: weights) {
            low = Math.max(low,weight);
            high += weight;
        }
        int ans = -1;
        while(low<= high) {
           int mid = low + (high-low)/2;
           if(canShip(weights,days,mid)) {
               ans = mid;
               high = mid-1;
           }else{
               low = mid+1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipwDays(weights,days));
    }
}
