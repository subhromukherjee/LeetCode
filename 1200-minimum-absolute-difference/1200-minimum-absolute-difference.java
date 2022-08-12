class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            int diff = arr[i]-arr[i-1];
            if(diff<minDiff){
                // Now that we get a new diff, remove all the values stored for the previous diffs
                // Store the pairs with the current min diff
                res.clear();
                res.add(Arrays.asList(arr[i-1],arr[i]));
                minDiff = arr[i]-arr[i-1];
            }else if(diff == minDiff){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}