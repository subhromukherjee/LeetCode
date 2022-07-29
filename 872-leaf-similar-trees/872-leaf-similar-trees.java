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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null)  
            return root1 == root2;
        
        ArrayList<Integer> tree1 = new ArrayList<>();
        helper(root1, tree1);
        ArrayList<Integer> tree2 = new ArrayList<>();
        helper(root2, tree2);
        
        return tree1.equals(tree2);
        
    }
    public void helper(TreeNode root, List<Integer> list){
        
        if(root == null)    return;
        // Check for leaf node
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        // Otherwise traverse
        helper(root.left, list);
        helper(root.right, list);
            
    }
    
}