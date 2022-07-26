class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount + 1];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        
        int min = f(n-1,coins,amount , dp);
        
        return min>=(int)1e9 ? -1 :min;
            
    }
    private int f(int idx , int[] coins , int target , int[][] dp)
    {
        if(idx == 0)
        {
            return (target%coins[idx] == 0) ? target/coins[0] : (int)1e9;
        }
      
        
        if(dp[idx][target] != -1)return dp[idx][target];
        
        int notTake = 0 + f(idx - 1 ,coins, target , dp);
        int take = Integer.MAX_VALUE;
        if(coins[idx]<= target)
        {
            take = 1 + f(idx , coins, target - coins[idx] ,dp); // not idx -1 because think if you have 10 at this index and your target is 21 so at first take one 10 then again take one 10 from that index only . 
			
        }
        
        return  dp[idx][target] = Math.min(take,notTake);
    }
}