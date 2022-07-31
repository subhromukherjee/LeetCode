class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // We start at either step 0 or step 1. 
        int prev = cost[0];
        int prev2 = cost[1];
        
        for(int i=2;i<cost.length;i++){
            int fs = prev + cost[i];
            int ss = prev2 + cost[i];
            int curr = Math.min(fs,ss);
            
            prev = prev2;
            prev2 = curr;
        }
        // The target is to reach either last or second last step, whichever is minimum.
        return Math.min(prev,prev2);
    }
}
// Bottom up computation - O(n) time, O(1) space