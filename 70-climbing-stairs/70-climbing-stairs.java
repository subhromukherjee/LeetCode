class Solution {
    public int climbStairs(int n) {
        // Fibonacci replica
        // To calculate the new value we only leverage the previous two values. So we don't need to use an array to store all the previous values.
        // Bottom Up Approach
        if(n<2) return 1;
        int prev1 = 1;
        int prev2 = 2;
        
        for(int i=3;i<=n;i++){
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}
// Complexity : Time: O(n) ; Space: O(1)