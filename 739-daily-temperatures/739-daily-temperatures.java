class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Monotonic stack
        // Next greater element
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int index = stack.pop();
                res[index] = i - index;
            }
                
            stack.push(i);
            
        }
        return res;
    }
}