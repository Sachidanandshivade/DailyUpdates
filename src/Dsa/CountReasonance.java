package Dsa;

import java.util.Scanner;

public class CountReasonance {
    static final int MOD = 1_000_000_007;

    public static int solve(int n, int[] arr){
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i =0;i<n;i++){
            prefix[i]= prefix[i-1]+arr[i];
        }
        int maxVal = prefix[n-1];
        int[] freq = new int[maxVal +1];
        long result =0;
        for(int j =0;j<n;j++){
            int p = prefix[j];
            for(int d=1;(long) d*d <= p;d++){
                if(p%d==0){
                    result = (result+freq[d])%MOD;
                    int other = p/d;
                    if(d != other){
                        result =(result+freq[other])%MOD;
                    }
                }
            }
            freq[p]++;
        }
        return (int) result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(n,arr));
    }
}
