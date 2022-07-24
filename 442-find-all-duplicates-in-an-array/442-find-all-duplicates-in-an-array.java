class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int no_of_chars = 1000000;
        int[] count = new int[no_of_chars];
        List<Integer> ans = new ArrayList<>();
        for(int i:nums)
            count[i]++;
        
        for(int i=1;i<=nums.length;i++)
            if(count[i]>1){
                ans.add(i);
                //count[i]=0;
            }
                
        return ans;
    }
}