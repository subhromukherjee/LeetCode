// (Using Moore’s Voting Algorithm):   

// Approach: This is a two-step process. 
// The first step gives the element that maybe the majority element in the array. If there is a majority element in an array, then this step will definitely return majority element, otherwise, it will return candidate for majority element.
// Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element.

// Complexity Analysis: 

// Time Complexity: O(n). 
// As two traversal of the array is needed, so the time complexity is linear.
// Auxiliary Space: O(1). 
// As no extra space is required.

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