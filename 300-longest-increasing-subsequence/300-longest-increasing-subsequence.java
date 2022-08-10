class Solution {
    public int lengthOfLIS(int[] nums) {
        // https://www.youtube.com/watch?v=odrfUCS9sQk
        int n = nums.length;
        int[] dp = new int[n];
        int ans=0;
        
        for(int i = 0; i<n ; i++){
            int max = 0;
            
            // Stores the longest increasing subsequence ending at i
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i])
                    if(dp[j]>max) 
                        max = dp[j];
            }
            
            dp[i] = max+1;
            
            // So we wont have to run another loop to find the max value
            if(dp[i]>ans)
                ans = dp[i];
        }
        return ans;
       
    }
}