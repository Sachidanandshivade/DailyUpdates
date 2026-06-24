package Dsa;

public class PalindromeSub {
    public static String longestPal(String s){
        if(s== null || s.length()<1 ) return "";
        int start =0,end=0;
        for(int i=0;i<s.length();i++){
            int len1 = expand(s,i,1);
            int len2 = expand(s,i,i+1);

            int maxLen = Math.max(len1,len2);
            if(maxLen >end-start+1) {
                start = i-(maxLen-1)/2;
                end = i+maxLen/2;
            }
        }
        return s.substring(start,end+1);
    }

    private static int expand(String s, int left, int right) {
        while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        System.out.println(longestPal("babad"));   // "bab"
        System.out.println(longestPal("cbbd"));    // "bb"
        System.out.println(longestPal("racecar")); // "racecar"
        System.out.println(longestPal("abacaba")); // "abacaba"
    }
}
