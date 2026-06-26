package Dsa;

import java.util.ArrayList;

public class prefixSum {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] arr = {1,2,4,5,6,3};
        int[][] arr1 = {
                {1,5},{2,4},{1,4}
        };

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr1.length;i++) {
            int L = arr1[i][0];
            int R = arr1[i][1];

            if(L == 0){
                result.add(prefix[R]);
            }else{
                result.add(prefix[R] - prefix[L-1]);
            }
        }
        System.out.println(result);
    }
}
