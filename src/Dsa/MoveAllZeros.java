package Dsa;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12,0,5};
        int k =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!= 0){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
