class Solution {
    public int missingNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=0;i<=nums.length;i++){
    //         int ans = bs(nums, i);
    //         if(ans == -1)
    //             return i;
    //     }
    //     return -1;
    // }
    // int bs(int[] nums, int x){
    //     int low = 0, high = nums.length-1;
    //     while(low<=high){
    //         int mid = low + (high-low)/2;
    //         if(nums[mid]==x)    
    //             return mid;
    //         if(x>nums[mid]){
    //             low = mid+1;
    //         }else{
    //             high = mid-1;
    //         } 
    //     }
    //     return -1;
        // BS solution TC nlogn
        int n = nums.length;
        int ogSum = n * (n+1)/2;
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        return ogSum-sum;
        
    }
}