class Solution {
    public List<Integer> findDuplicates(int[] nums) {
//         int no_of_chars = 1000000;
//         int[] count = new int[no_of_chars];
//         List<Integer> ans = new ArrayList<>();
//         for(int i:nums)
//             count[i]++;
        
//         for(int i=1;i<=nums.length;i++)
//             if(count[i]>1){
//                 ans.add(i);
//             }
                
//         return ans;
        // General approach : count each char
        //     But in this qstn nums range is given so we can convert already seen numbers into negative
        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            int index = Math.abs(i);
            if(nums[index-1]>0)
                nums[index-1] *= -1;
            else
                ans.add(index);
        }
        return ans;
        
    }
}