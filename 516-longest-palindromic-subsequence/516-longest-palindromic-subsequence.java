class Solution {
    
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len+1][len+1];
        for(int rows[]: dp)
             Arrays.fill(rows,-1);
        char[] ch = s.toCharArray();
        String rev="";
        for(char c:s.toCharArray()){
            rev = c+rev;
        }
        return lcs(s, rev, len, len, dp);
    }
    int lcs(String x, String y, int m, int n, int[][] dp){
        if(m==0 || n==0){
            return 0;
        }
        if(dp[m][n]!=-1)    return dp[m][n];
        if(x.charAt(m-1) == y.charAt(n-1))
            return dp[m][n] = 1+lcs(x, y, m-1, n-1, dp);
        else
            return dp[m][n] = Math.max(lcs(x, y, m-1, n, dp), lcs(x, y, m, n-1, dp));  
        
    }
    
}
// LPS is LCS(string1, reverse(String1))