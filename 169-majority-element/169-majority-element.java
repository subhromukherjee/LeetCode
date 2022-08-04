class Solution {
    public int majorityElement(int[] nums) {
        int ans = findMajority(nums);
        if(isMajority(ans, nums)) return ans;
        return -1;
        
    }
    
    int findMajority(int[] nums){
        int majIndex = 0, count = 1; 
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[majIndex])
                count++;
            else
                count--;
            if(count == 0){
                 majIndex = i;
                count = 1;
            }
               
        }
        return nums[majIndex];
    }
    
    boolean isMajority(int num, int[] nums){
        int count = 0;
        for(int i:nums)
            if(i==num)
                count++;
        if(count>nums.length/2) return true;
        return false;
    }
}