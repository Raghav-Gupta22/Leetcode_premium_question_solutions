// Problem link on leetcode: https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/
// Problem link on lintcode: https://www.lintcode.com/problem/595

//recursive O(N^2)
public class Solution {
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;

        int l = longestConsecutive(root.left);
        int r = longestConsecutive(root.right);
        int lr = getMaxPath(root);

        return Math.max(Math.max(l, r), lr);
    }
    private int getMaxPath(TreeNode root){
        if(root == null) return 0;

        int lh = 0, rh = 0;
        if(root.left!=null && root.val + 1 == root.left.val){
            lh = getMaxPath(root.left);
        }

        if(root.right!=null && root.val + 1 == root.right.val){
            rh = getMaxPath(root.right);
        }
        return 1+Math.max(lh, rh);
    }
}

