class Solution {
    public int lengthOfLIS(int[] nums) {
        // https://www.youtube.com/watch?v=odrfUCS9sQk
//         int n = nums.length;
//         int[] dp = new int[n];
//         int ans=0;
        
//         for(int i = 0; i<n ; i++){
//             int max = 0;
            
//             // Stores the longest increasing subsequence ending at i
//             for(int j=0;j<i;j++){
//                 if(nums[j]<nums[i])
//                     if(dp[j]>max) 
//                         max = dp[j];
//             }
            
//             dp[i] = max+1;
            
//             // So we wont have to run another loop to find the max value
//             if(dp[i]>ans)
//                 ans = dp[i];
//         }
//         return ans;
       //O(n^2)
        
        // Binary search approach O(nlogn)
        int n = nums.length;
        int dp[] = new int[n];
        int len = 0;
        
        for(int currentElement:nums){
            int i = Arrays.binarySearch(dp, 0, len, currentElement);
            if(i<0) // Element not found
                i = -(i+1);
            
            dp[i] = currentElement; // Replacing the element
            // Element found at last pos
            if(i==len)  len++;
            
        }
        return len;

// The idea is that as you iterate the sequence, you keep track of the minimum value a subsequence of given length might end with, for all so far possible subsequence lengths. So dp[i] is the minimum value a subsequence of length i+1 might end with. Having this info, for each new number we iterate to, we can determine the longest subsequence where it can be appended using binary search. The final answer is the length of the longest subsequence we found so far.
        
       // Arrays.binarySearch()
        // Return Type: index of the search key, if it is contained in the array; otherwise, (-(insertion point) – 1). The insertion point is defined as the point at which the key would be inserted into the array: the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key. Note that this guarantees that the return value will be >= 0 if and only if the key is found.
    }
}