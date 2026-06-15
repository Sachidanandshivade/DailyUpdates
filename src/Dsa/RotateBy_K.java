package Dsa;

import java.util.Arrays;

public class RotateBy_K {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        int n = arr.length;
        k=k%n; //handle k values > n

        //reverse whole array
        int left=0,right = n-1;
        while(left <right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        //reverse first k elements
        left =0;right = k-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        left =k;right = n-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        }
}
