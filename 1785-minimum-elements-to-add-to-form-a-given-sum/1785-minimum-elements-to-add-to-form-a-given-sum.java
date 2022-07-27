class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int i:nums)
            sum+=i;
        long remaining = Math.abs(goal - sum);
        // System.out.println(remaining/limit);
        // System.out.println(remaining%limit);
        return (int)(remaining/limit)+((remaining%limit)==0?0:1);
    }
}