class Solution {
    public int rob(int[] nums) {
        // Maximum Sum of Non-Adjacent Elements
        // https://www.youtube.com/watch?v=GrMBfJNk_NY
        
        int prev = nums[0]; // dp[i-1]
        int prev2 = 0;  // dp[i-2]
        
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i>1) take+=prev2;    // for i<1 dp[i-2] index becomes negetive
            
            int notTake = 0+prev;   // Not taken, so added 0 -> previous value is carried forward
            int curi = Math.max(take, notTake);
            prev2 = prev;
            prev = curi;
            
        }
        return prev;
    }
}