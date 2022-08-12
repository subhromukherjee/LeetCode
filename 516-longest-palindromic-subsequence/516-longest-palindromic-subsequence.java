class Solution {
    //Memoised
//     public int longestPalindromeSubseq(String s) {
//         int len = s.length();
//         int[][] dp = new int[len+1][len+1];
//         for(int rows[]: dp)
//              Arrays.fill(rows,-1);
//         char[] ch = s.toCharArray();
//         String rev="";
//         for(char c:s.toCharArray()){
//             rev = c+rev;
//         }
//         return lcs(s, rev, len, len, dp);
//     }
//     int lcs(String x, String y, int m, int n, int[][] dp){
//         if(m==0 || n==0){
//             return 0;
//         }
//         if(dp[m][n]!=-1)    return dp[m][n];
//         if(x.charAt(m-1) == y.charAt(n-1))
//             return dp[m][n] = 1+lcs(x, y, m-1, n-1, dp);
//         else
//             return dp[m][n] = Math.max(lcs(x, y, m-1, n, dp), lcs(x, y, m, n-1, dp));  
        
//     }
    
    
    // Tabulation
    public int longestPalindromeSubseq(String s){
        int m = s.length();
        int n = m;
        int[][] dp = new int[m+1][n+1];
        
        // Reverse string
        char[] ch = s.toCharArray();
        String rev="";
         for(char c:s.toCharArray()){
             rev = c+rev;
         }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(s.charAt(i)==rev.charAt(j))
                    dp[i+1][j+1] = 1+dp[i][j];
                else
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
            }
        }
        return dp[m][n];
        
    }
    
    
}
// LPS is LCS(string1, reverse(String1))