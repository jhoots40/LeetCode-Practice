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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = new TreeNode();
        rearrangeBST(result, root);
        return result.right;
    }
    
    public void rearrangeBST(TreeNode result, TreeNode oldTree) {
        if(oldTree == null) return;
        
        //add nodes in order
        rearrangeBST(result, oldTree.left);
        addTreeNode(result, oldTree.val);
        rearrangeBST(result, oldTree.right);
    }
    
    public void addTreeNode(TreeNode result, int val) {
        while(result.right != null) result = result.right;
        result.right = new TreeNode(val);
    }
}