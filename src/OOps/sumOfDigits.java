package OOps;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(SumCal.sum(1234));
        System.out.println(SumCal.Divisor(1234));
    }
}

class SumCal {
    public static boolean sum(int n){
        int sum=0;
        int x =0;
        while(n>0){
            x = n%10;
            sum += x;
            n = n/10;
        }

        return sum < 11;
    }

    public static int Divisor(int num) {
        int count =1;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
}
