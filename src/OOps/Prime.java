package OOps;

import java.util.Scanner;

public class Prime {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IsPrime p = new IsPrime();
        boolean result = p.gg(n);
        System.out.println(n + " is prime number" + result);
    }
}

class IsPrime{
    public boolean gg(int n){
        boolean isPrime = true;
        for(int i=2;i<= n/2;i++){
            if(n % i == 0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }
}
