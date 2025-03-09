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
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if (root != null)
            stack.push(root);
        while (!stack.empty()) {
            TreeNode poppedRoot = stack.pop();
            if (poppedRoot != null)
                res.add(poppedRoot.val);
            if ( poppedRoot.right != null)
                stack.push(poppedRoot.right);
            if ( poppedRoot.left != null)
                stack.push(poppedRoot.left);
        }
        return res;
    }
}