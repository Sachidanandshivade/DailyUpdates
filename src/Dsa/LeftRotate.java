package Dsa;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        //save first element
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        System.out.println(Arrays.toString(arr));

        rightRotate();

    }

    public static void rightRotate(){
        int[] arr = {1,2,3,4,5};
        //save last element
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }
}
