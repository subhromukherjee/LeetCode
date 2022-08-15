class Solution {
    public int longestIdealString(String s, int k) {
        int[][] dp = new int[s.length()+1][150];
        for(int[] rows:dp)
            Arrays.fill(rows, -1);
        return helper(s, k, 0, '#', dp);
    }
    
    int helper(String s, int k, int idx, char prev, int[][] dp){
        // Base
        if(idx == s.length())   return 0;   // Reached end of string
        if(dp[idx][prev] != -1) return dp[idx][prev];
        char curr = s.charAt(idx);
        int pick = 0;
        if(Math.abs(prev - curr)<=k || prev=='#')   // taken # as dummy char because in ascii table # is adjcent of z , so it will automatically cover by 150 dimension of dp
            pick = 1+helper(s, k, idx+1, curr, dp);
        int notPick = helper(s, k, idx+1, prev, dp);
        
        return dp[idx][prev] = Math.max(pick, notPick);
       
    }
}