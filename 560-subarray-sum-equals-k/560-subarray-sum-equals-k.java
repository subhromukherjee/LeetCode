// Remember the frequency of all prefix sums. O(n) time and O(n) memory.
// sum to keep track of sum of all the elements so far. If we can find a prefix sum in the map for sum-k, it means we can form sum == k using the elements after the element corresponding to that prefix sum till the current element (included). Count all such sums at each element.
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0, sum = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        
        for(int i:nums){
            sum+=i;
            count += preSum.getOrDefault(sum-k, 0);
            
            preSum.put(sum, preSum.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
}