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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return parse(root, low, high);
    }
    
    public int parse(TreeNode current, int low, int high) {
        if(current == null) return 0;
        
        int value = 0;
        
        if(low <= current.val && current.val <= high) value = current.val;
        
        int left = parse(current.left, low, high);
        int right = parse(current.right, low, high);
        
        return value + left + right;
    }
}