class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prefix = 1, suffix = 1;
        
        // Storing prefix sums
        for(int i=0;i<nums.length;i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }
        
        // multiplying prefix sums with suffix
        for(int i=nums.length-1;i>=0;i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}