class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i1=0;i1+2<nums.length;i1++){
            // Skip duplicates
            if(i1>0 && nums[i1] == nums[i1-1])
                continue;
            int i2 = i1+1;
            int i3 = nums.length-1;
            // if((i1 == i2) || (i1 == i3) || (i2 == i3))
            //     continue;
            while(i2<i3){
                int sum = nums[i1]+nums[i2]+nums[i3];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i1],nums[i2],nums[i3]));
                    i3--;
                    while(i2<i3 && nums[i3]==nums[i3+1])
                        i3--;
                }
                else if(sum>0){
                    i3--;
                }
                else i2++;
                }
            
        }
        return ans;
        
    }
}