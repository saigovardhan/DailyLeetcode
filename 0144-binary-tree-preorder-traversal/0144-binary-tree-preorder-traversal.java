/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // pre order -> root -> left -> right
        List<Integer> result = new ArrayList<>();
        recursivePreOrderTraversal(result, root);
        return result;
    }

    public void recursivePreOrderTraversal(List<Integer> res, TreeNode root) {
        if (root != null) {
            res.add(root.val);
        }
        if ( root != null &&root.left != null )
            recursivePreOrderTraversal(res, root.left);
        if (root != null && root.right != null )
            recursivePreOrderTraversal(res, root.right);
    }
}