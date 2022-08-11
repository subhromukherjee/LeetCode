class Solution {
//     public static int[][] dp = new int[1001][1001];
//     public int longestCommonSubsequence(String text1, String text2) {
//         //https://youtu.be/4Urd0a0BNng
//         // Memoized solution
//         for(int rows[]: dp)
//             Arrays.fill(rows,-1);
//         return lcs(text1, text2, text1.length(), text2.length());
//     }
    
//     int lcs(String x, String y, int m, int n){
//         // Base case
//         // Think of smallest valid input
//         // It will x="" ans y=""
//         // In that case there is nothing common
//         // Ex: x="abc" y="" -> No common -> lcs length=0
//         if(m==0 || n==0)    return 0;
//         if(dp[m-1][n-1] != -1)    return dp[m-1][n-1];
//         // If last element in common
//         if(x.charAt(m-1) == y.charAt(n-1))
//             return dp[m-1][n-1]=1+lcs(x, y, m-1, n-1);    // Found 1 common -> so increase length by 1
//         else
//             return dp[m-1][n-1]=Math.max(lcs(x,y,m,n-1), lcs(x,y,m-1,n));   
//                 // We have 2 choices here
//                 // Either take reduce 1st string or reduce 2nd
//                 // take whichever gives max result
        
//     }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(text1.charAt(i)==text2.charAt(j))
                    dp[i+1][j+1] = 1+dp[i][j];
                else
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                
                
            }
        }
        return dp[m][n];
    }
    
    
//     Analysis:

// Time & space: O(m * n)
}