class Solution {
    public boolean isSymmetric(TreeNode root) {
       if(root == null) return true;
      TreeNode root1 = root.left;
      TreeNode root2 = root.right;
      return checkSymmetric(root1, root2);
    }


    public boolean checkSymmetric(TreeNode root1, TreeNode root2){
        if(root1 == null||  root2 == null){
            return root1 == root2;
        }

    
        return 
        (root1.val == root2.val) &&
        checkSymmetric(root1.left, root2.right) &&
        checkSymmetric(root1.right, root2.left);
    }
}
