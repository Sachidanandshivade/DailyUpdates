package Dsa;

import java.util.Scanner;

public class Isomorphic {
    public static String checkIsomorphic(String s1, String s2) {
        // If lengths are different, they cannot be isomorphic
        if (s1.length() != s2.length()) {
            return "NO";
        }

        // Arrays to store the last seen positions of characters (initialized to 0)
        int[] mapS1 = new int[256];
        int[] mapS2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // If the last seen positions don't match, the mapping is broken
            if (mapS1[c1] != mapS2[c2]) {
                return "NO";
            }

            // Record the current position (using i + 1 to avoid conflict with default 0)
            mapS1[c1] = i + 1;
            mapS2[c2] = i + 1;
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            String result = checkIsomorphic(s1, s2);
            System.out.println(result);
        }
    }
}