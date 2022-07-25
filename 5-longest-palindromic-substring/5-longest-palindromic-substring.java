class Solution {
    public String longestPalindrome(String s) {
        // https://www.youtube.com/watch?v=WpYHNHofwjc
        // Logic : Extremeties should be same
        // Part in between should be palindrome
        boolean[][] dp=new boolean[s.length()][s.length()];
        int start=0, end=1, len=0;
        for(int g=0; g<s.length();g++){
            
            // Start point of every diagonal is 0,gap
            // Ends at last column
            for(int i=0, j=g; j<s.length(); i++,j++){
                // 1 char is always palindrome
                if(g == 0){
                    dp[i][j] = true;
                }
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j))
                        dp[i][j] = true;
                    else
                        dp[i][j] = false;
                }
                else {
                    // Extremeties should be same and inner part should be palindrome
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true)
                        dp[i][j] = true;
                    else
                        dp[i][j] = false;
                    
                }
                if(dp[i][j]){
                    len = g+1;
                    start = i;
                    end = j;
                    
                }
                    
                
            }
        }
        // Length of longest plaindromic substring
        // System.out.println(len);
        return s.substring(start, end+1);
        
    }
}