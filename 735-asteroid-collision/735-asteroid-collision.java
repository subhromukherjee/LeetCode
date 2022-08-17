class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i:asteroids){
            if(i>0){    // positive asteroid
                stack.push(i);
            }else{  // negative asteroid
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()< -i)
                    stack.pop();
                
                if( stack.isEmpty()  ||  stack.peek()<0)
                    stack.push(i);  // both negative, so no collision
                else if(stack.peek() + i == 0)  // equal mass
                    stack.pop();
            }
        }
        int[] res = new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
            res[i] = stack.pop();
        return res;
    }
}