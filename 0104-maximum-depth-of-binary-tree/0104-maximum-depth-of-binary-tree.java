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
    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        if(root.left == null && root.right ==null) return 1;
        return recursive(root);
    }

    public int recursive(TreeNode root){
        if(root == null) return 0;

        int left =1+ recursive(root.left);
        int right =1+ recursive(root.right);

        return Math.max(left, right);
    }
}