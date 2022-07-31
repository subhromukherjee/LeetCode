class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev = cost[0];
        int prev2 = cost[1];
        
        for(int i=2;i<cost.length;i++){
            int fs = prev + cost[i];
            int ss = prev2 + cost[i];
            int curr = Math.min(fs,ss);
            
            prev = prev2;
            prev2 = curr;
        }
        return Math.min(prev,prev2);
    }
}