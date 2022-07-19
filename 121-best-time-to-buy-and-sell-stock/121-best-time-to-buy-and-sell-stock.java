class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int profit=0;
        for(int i:prices){
            low = Math.min(low,i);
            
            profit = Math.max(profit, i-low);
        }
        return profit;
    }
}