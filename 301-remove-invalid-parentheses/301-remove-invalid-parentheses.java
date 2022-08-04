class Solution {
    public List<String> removeInvalidParentheses(String s) {
        // Shortest-path problem is natural to BFS.
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        q.offer(s);
        List<String> valid = new ArrayList<>(); // Indicate whether a valid node has been met as well as store it
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                String curr = q.poll();
                
                if(isValid(curr))   valid.add(curr);
                
                // If no valid node has been met
                // Add adjacent nodes to queue
                if(valid.isEmpty()){
                    for(int j=0;j<curr.length();j++){
                        if(curr.charAt(j) == ')' || curr.charAt(j) == '('){
                            String adj = curr.substring(0,j) + curr.substring(j+1);
                            
                            if(!visited.contains(adj)){
                                visited.add(adj);
                                q.offer(adj);
                            }
                        }
                            
                    }
                }
                  
            }
            if(!valid.isEmpty())    return valid;
            
        }   // While loop ends
        throw null;
    }
    public boolean isValid(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(c == '(')    count++;
            if(c == ')')    count--;
            if(count<0) return false;   // More closed than open
        }
        // if(count==0)    return true;
        // return false;
        return count==0;
    }
}