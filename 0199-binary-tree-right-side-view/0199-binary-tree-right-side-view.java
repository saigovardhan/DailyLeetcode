import java.util.*;
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = queue.size();

        while(!queue.isEmpty()){
            TreeNode temp = null;
            size = queue.size();

            for(int i=0;i<size;i++){
                temp = queue.poll();
                if(temp.left !=null) queue.offer(temp.left);
                if(temp.right !=null) queue.offer(temp.right);
            }

            if(temp!=null){
                result.add(temp.val);
            }
        }
        return result;
    }
}