package OOps;

public class Palindrome {
    public static void main(String[] args) {
      boolean result= ticket.pal(1233421);
      System.out.println(result);

      boolean  ss = ticket.strpal("race");
      System.out.println(ss);
    }

}

class ticket {
    public static boolean pal(int n) {
        int x = n;
        int rev = 0;
        int rem =0;
        while(x>0){
            rem = x%10;
            rev = rev*10 + rem;
            x= x/10;
        }

        return rev == n;
    }
    public static boolean strpal(String str){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                return true;
            }
            left++;
            right--;

        }
        return false;
    }
}
