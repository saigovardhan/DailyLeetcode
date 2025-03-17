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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       TreeNode p1 = p;
       TreeNode p2= q;
        boolean res = dfs(p1, p2);
        return res;
    }

    public boolean dfs(TreeNode p1, TreeNode p2){
        if(p1 ==null && p2 ==null) return true;
        if(p1 == null || p2 ==null || p1.val !=p2.val) return false;
        boolean left =   dfs(p1.left, p2.left);
        boolean right =  dfs(p1.right, p2.right);
        return left && right;
    }
}