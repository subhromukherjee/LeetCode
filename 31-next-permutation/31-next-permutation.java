class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        int idx1 = -1, idx2=-1;
        // https://www.youtube.com/watch?v=LuLCLgMElus
        // Algo
        // iterate from back
        // It will always be in increasing order
        // find break point
        // Find next greater number than break point
        // swap
        // Reverse
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1 = i;
                break;
            }
        }
        
        if(idx1 == -1){
            // last combination
            reverse(nums,0, nums.length-1);
            return;
        }else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[idx1]){
                    idx2 = i;
                    swap(nums, idx1, idx2);
                    break;
                }
            }
        }
        reverse(nums, idx1+1, nums.length-1);
        
        
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i++, j--);
        }
    }
}