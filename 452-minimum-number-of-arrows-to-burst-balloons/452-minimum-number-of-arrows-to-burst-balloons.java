class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int currEnd = points[0][1];
        int arrow = 1;
        // Run a loop and compare if any range start is greater than currEnd
        // if yes then that means that point is out of current range.
        for(int i=1;i<points.length;i++){
            if(points[i][0]>currEnd){
                arrow++;
                currEnd = points[i][1];
            }
                
        }
        return arrow;
    }
}