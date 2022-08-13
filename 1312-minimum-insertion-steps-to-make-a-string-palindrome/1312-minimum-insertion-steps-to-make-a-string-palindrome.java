class Solution {
    // Min. no of insertion = Min no of deletion  = Length of string - LPS (=gives the chars that dont have pair)
    public int minInsertions(String s) {
        //int m = s.length(), n=m;
        return s.length() - LPS(s);
    }
    int LPS(String s){
        String rev = "";
        for(char c:s.toCharArray())
            rev = c+rev;
        return LCS(s, rev, s.length(), s.length());
    }
    int LCS(String x, String y, int m, int n){
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x.charAt(i)==y.charAt(j)){
                    dp[i+1][j+1] = 1+dp[i][j];
                }else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        return dp[m][n];
        
    }
}