class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        return lotRecursive(root);
    }

    public List<List<Integer>> lotRecursive(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean leftToRight = false;
        if (root == null)
            return res;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode popped = new TreeNode();
                popped = queue.poll();
                if (leftToRight) {
                    temp.add(0, popped.val);
                } else {
                    temp.add(popped.val);
                }
                if (popped.left != null) {
                    queue.add(popped.left);
                }
                if (popped.right != null) {
                    queue.add(popped.right);
                }
            }
            leftToRight = !leftToRight;
            res.add(temp);
        }
        return res;
    }
}