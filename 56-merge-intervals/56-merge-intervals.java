class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
			return intervals;
        
        // Sort by ascending starting point
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        int[] newInterval = intervals[0];
        res.add(newInterval);
        
        for(int[] currInterval:intervals){
            // Overlapping intervals
            // This interval starts before the previous ends, so merge
            if(currInterval[0]<=newInterval[1])
                // Selecting the bigger end time
                newInterval[1] = Math.max(newInterval[1], currInterval[1]);
                // Chnaged only end time, starting time remains the prev only bcz we sorted already
            else{
                // Store to compare with next
                newInterval = currInterval;
                // Add as it is
                res.add(newInterval);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
}