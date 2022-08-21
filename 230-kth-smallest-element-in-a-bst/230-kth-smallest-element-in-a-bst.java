/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inOrder(root, new ArrayList<>());
        
        return nums.get(k-1);
    }
    
    ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> nums){
        if(root == null)    return nums;
        
        inOrder(root.left , nums);
        nums.add(root.val);
        inOrder(root.right, nums);
        return nums;
    }
}