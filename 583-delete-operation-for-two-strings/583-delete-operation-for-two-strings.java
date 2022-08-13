class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] rows:dp)
            Arrays.fill(rows, -1);
        int lcs = LCS(word1, word2, m, n, dp);
        //System.out.println(lcs);
        return (m-lcs) + (n-lcs) ;
    }
    // Recursive -> TLE
    // int LCS(String x, String y, int m, int n){
    //     if(m==0 || n==0)    return 0;
    //     if(x.charAt(m-1) == y.charAt(n-1)){
    //         return 1+LCS(x, y, m-1, n-1);
    //     }else{
    //         return Math.max(LCS(x,y,m-1,n), LCS(x,y,m,n-1));
    //     }
    // }
    // Memoized
    int LCS(String x, String y, int m, int n, int[][]dp){
        if(m==0 || n==0)    return 0;
        if(dp[m-1][n-1]!=-1)    return dp[m-1][n-1];
        if(x.charAt(m-1) == y.charAt(n-1)){
            return dp[m-1][n-1] = 1+LCS(x, y, m-1, n-1, dp);
        }else{
            return dp[m-1][n-1] = Math.max(LCS(x,y,m-1,n,dp), LCS(x,y,m,n-1,dp));
        }
    }
    
}