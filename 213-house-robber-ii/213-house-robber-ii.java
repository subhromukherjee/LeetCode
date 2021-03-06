class Solution {
        // The only difference from House Robber I is that all the houses are in the circle here, which simply means if you select the first one then you WON'T be able to select the last one since they are neignbors. Only when you NOT select the first one, you then COULD select the last one. Hey, why don't we break the circle => e.g. houses are [2,7,9,3,1], if I select the first one (which has money 2), I don't even care about the last one, question will become to rob [2,7,9,3] instead. Same, if we did not select first one, question becomes to rob [7,9,3,1], and the final result would be the larger result between them. OMG House Robber II really is want us to do House Robber I twice!
        
    
    public int rob(int[] nums) {
        if(nums.length == 1)    return nums[0];
        
        int one = HouseRobberOne(nums,0,nums.length-1);
        int two = HouseRobberOne(nums,1,nums.length);
        
        return Math.max(one,two);
    }
    
    public int HouseRobberOne(int []nums,int start,int end){
        int prev = nums[start],prev2 = 0;
        
        for(int i = start + 1;i<end;i++){
            int take = prev2 + nums[i]; // prev2 = dp[i-2]
            int notTake = Math.max(prev,prev2);
            prev = take;
            prev2 = notTake;
        }
        
        return Math.max(prev,prev2);
    }
    
}