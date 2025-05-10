class Solution {
    public int maxDepth(TreeNode root) {
        int res = recursiveDepth(root);
        return res;
    }

    public int recursiveDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }


            int left = recursiveDepth(root.left);
       
            int right = recursiveDepth(root.right);
        

        return 1+ Math.max(left, right);
    }
}