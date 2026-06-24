package Dsa;

import java.util.HashSet;

public class longestSubString {
    public static int lengthSS(String s){
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int max= 0;
        for(int i = 0; i<s.length();i++) {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }

        return max;
        }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthSS(s));
    }
}
