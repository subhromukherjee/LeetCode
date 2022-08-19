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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)    return ans;
        
        solver(root, ans);
        return ans;
    }
    
    public void solver(TreeNode root, List<Integer> res){
        if(root!=null){
            solver(root.left, res);
            res.add(root.val);
            solver(root.right, res);
        }
    }
}