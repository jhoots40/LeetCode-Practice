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
    public boolean evaluateTree(TreeNode root) {
        return evaluate(root);
    }
    
    public boolean evaluate(TreeNode node) {
        if     (node.val == 0) return false;
        else if(node.val == 1) return true;
        else if(node.val == 2) return evaluate(node.left) || evaluate(node.right);
        else if(node.val == 3) return evaluate(node.left) && evaluate(node.right);
        else return false;
        
    }
}