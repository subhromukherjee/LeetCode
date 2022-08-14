class Solution {
    // Nearest smaller to the right
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    res[i]=prices[i]-prices[j];
                    break;
                }
                    
            }
            // Smaller element not found -> loop ran totally
            if(j==n)    res[i]=prices[i];
        }
        return res;
    }
}