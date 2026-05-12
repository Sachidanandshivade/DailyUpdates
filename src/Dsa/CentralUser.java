package Dsa;

import java.util.Scanner;

public class CentralUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        for(int i = 0;i<n-1;i++){
            int u = sc.nextInt();
            int v= sc.nextInt();
            d[u]++;
            d[v]++;
        }
        int center = -1;
        for(int i=1;i<=n;i++){
            if(d[i]== n-1){
                center = i;
                break;
            }
        }
        if(center != -1){
            System.out.println(center);
        }else{
            System.out.println("None");
        }
        sc.close();
    }
}
