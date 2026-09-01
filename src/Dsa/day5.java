//swap colors

public int[][] floodfill(int[][] image, int sr,int sc,int color) {
    int original =image[sr][sc];

    if(original == color) {
        return image;
    }

    dfs(image,sr,sc,original,color);
    return image;
}

private void dfs(int[][] image,int r,int cm int original,int color) {
    if(r<0 || r>= image.length || c<0 || c >= image[0].length) {
        return;
    }

    if(image[sr][sc] != original) {
        return;
    }

    image[r][c] = color;

    dfs(image,r-1,c,original,color);
    dfs(image,r+1,c,original,color);
    dfs(image,r,c-1,original,color);
    dfs(image,r,c+1,original,color);

}


// longest substring without repeating characters

public int lengthLongestSUb(String s) {
    Map<Character,Integer> map = new HashMap<>();

    int left =0;
    int maxLength = 0;
    for(int right =0;right<s.length();right++) {
        char ch = s.charAt(right);
        if(map.containsKey(ch)) {
            left = Math.max(left,map.get(ch)+1);
        }
        map.put(ch,right);

        maxLength = Math.max(maxLength, right-left+1);
    
    }
    return maxLength;
}

// group anagrams

public List<List<String>> groupA(String[] s) {
    Map<String,List<String>> map = new HashMap<>();

    for(String str: s) {
        char[] ch = str.toCharArray();
        Arrays.sort(chars);
        String key = new string(chars);
        map.computeIfAbsent(key,k-> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(map.values());
}

//longest palindrome subseq 

public int longestPal(String s) {
    int n = s.length();
    String rev = new StringBuilder(s).reverse().toString();
    int[][] dp = new int[n+1][n+1];
    for(int i=1;i<=n;i++) {
        for(int j =1;j<=n;j++) {
            if(s.charAt(i-1) == rev.charAt(j-1)) {
                dp[i][j] = 1+dp[i-1][j-1];
            }else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[n][n];
}


// minimum no of operation to make palindrome 

class Solution {

    public int minInsertions(String s) {

        int n = s.length();

        int[] dp = new int[n];

        for (int left = n - 2; left >= 0; left--) {

            int prev = 0;  // dp[left + 1][right - 1]

            for (int right = left + 1; right < n; right++) {

                int temp = dp[right];

                if (s.charAt(left) == s.charAt(right)) {

                    dp[right] = prev;

                } else {

                    dp[right] = 1 + Math.min(
                        dp[right],     // dp[left + 1][right]
                        dp[right - 1]  // dp[left][right - 1]
                    );
                }

                prev = temp;
            }
        }

        return dp[n - 1];
    }
}

