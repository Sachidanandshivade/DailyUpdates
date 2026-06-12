package OOps;

import java.util.Scanner;

public class CalFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial f = new Factorial();
        int result = f.fact(n);
        System.out.println("the factorial of "+n + " is " + result);
    }
}
class Factorial{
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
