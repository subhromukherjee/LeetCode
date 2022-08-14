class Solution {
    // Nearest smaller to the right
    // Brute force
//     public int[] finalPrices(int[] prices) {
//         int n = prices.length;
//         int[] res = new int[n];
//         int i,j;
//         for(i=0;i<n;i++){
//             for(j=i+1;j<n;j++){
//                 if(prices[j]<=prices[i]){
//                     res[i]=prices[i]-prices[j];
//                     break;
//                 }
                    
//             }
//             // Smaller element not found -> loop ran totally
//             if(j==n)    res[i]=prices[i];
//         }
//         return res;
//     }
    public int[] finalPrices(int[] prices){
        int n = prices.length;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && stack.peek()>prices[i])
                stack.pop();
            if(!stack.isEmpty())
                res[i] = prices[i] - stack.peek();
            else
                res[i] = prices[i];
            stack.push(prices[i]);
        }
        return res;
    }
    
}