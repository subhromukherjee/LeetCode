class Solution {
    public boolean increasingTriplet(int[] nums) {
        // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=small)
                small = i;  // update small if n is smaller than both
            else if(i<=big)
                big = i;    // update big only if greater than small but smaller than big
            else return true;
            // return if you find a number bigger than both
        }
        return false;
    }
}