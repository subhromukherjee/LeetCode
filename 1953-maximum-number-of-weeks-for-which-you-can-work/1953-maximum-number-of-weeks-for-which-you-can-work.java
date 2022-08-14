class Solution {
    public long numberOfWeeks(int[] milestones) {
        long max = Integer.MIN_VALUE;
        long sum=0;
        for(int i:milestones){
            max = Math.max(max, i);
            sum+=i;    
        }
        return Math.min(sum, 2*(sum-max)+1);
    }
    
}
//O(n)
// Intuition:
// According to the rule "cannot work on two milestones from the same project for two consecutive weeks.", we at least need to avoid the consecutive working on the project with the maximum milestones, which are most likely to be involved to violate the rule.

// If the max of the milestones is no more than the the remaining sum by 1, sum(milestones) - max + 1, we can always use the remaining parts to divide the project with max milestones, hence the answer is sum(milestones); e.g.,
// milestones = [1,2,4], that is, projects p0, p1, p2 have 1,2, and 4 milestones repectively.

// We can separate the 4 milestones using the remaining 1 + 2 = 3 ones: p2, p0, p2, p1, p2, p1, p2;

// Otherwise, get the remaining part + 1 out of the max, together with the remaing part, is the solution: 2 * (sum(milestones) - max) + 1. e.g.,
// milestones = [1,5,2], that is, projects p0, p1, p2 have 1,5, and 2 milestones repectively.

// We can use the 1 + 2 = 3 milestones from p0 and p2 to separate only 3 + 1 = 4 milestones out of the 5 ones from p1: p1, p0, p1, p2, p1, p2, p1.