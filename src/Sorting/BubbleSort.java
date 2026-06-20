package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static  void bubble(int[] arr){
        int n = arr.length;
        int i,j,temp;
        for(i=0;i<n-1;i++) {
            for(j =0;j< n-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
