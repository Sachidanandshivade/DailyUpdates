package Dsa;

public class KadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int globalMax = nums[0];

        for(int i=1;i<nums.length;i++) {
            currentMax = Math.max(nums[i] ,currentMax+nums[i]);
            globalMax = Math.max(globalMax,currentMax);
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr ={4,-1,2,1} ;
        int maxSum = maxSubArray(arr);
        System.out.println("The maximum contiguous subarray sum is: " + maxSum);
    }
}
