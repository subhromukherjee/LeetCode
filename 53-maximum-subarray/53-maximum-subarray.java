class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        
        for(int i:nums){
            currSum = Math.max(currSum+i, i);
            maxSum = Math.max(currSum, maxSum);
            
        }
        return maxSum;
    }
}