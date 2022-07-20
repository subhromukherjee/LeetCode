class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int res = 0;
        int[] larr = new int[len];
        int[] rarr = new int[len];
        larr[0] = height[0];
        rarr[len-1] = height[len-1];
        
        for(int i=1;i<len;i++){
            larr[i] = Math.max(larr[i-1],height[i]);
        }
        for(int i=len-2;i>=0;i--){
            rarr[i] = Math.max(rarr[i+1],height[i]);
        }
        for(int i=0;i<len-1;i++){
            res+=Math.min(larr[i], rarr[i])-height[i];
        }
        return res;
    }
}