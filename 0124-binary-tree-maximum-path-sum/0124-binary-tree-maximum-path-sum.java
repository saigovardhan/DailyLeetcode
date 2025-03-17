class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        dfs(root, maxSum);
        return maxSum[0];
    }

    public int dfs(TreeNode root, int[] maxSum){
        if(root==null){
            return 0;
        }
        int left  = Math.max(0, dfs(root.left , maxSum));
        int right = Math.max(0, dfs(root.right, maxSum));

        maxSum[0] = Math.max((left + right+ root.val), maxSum[0]);

        return root.val+ Math.max(left, right);
    }
}