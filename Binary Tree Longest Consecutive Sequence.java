// Problem link on leetcode: https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/
// Problem link on lintcode: https://www.lintcode.com/problem/595

//recursive O(N^2) time complexity
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

// single traversal O(N) time complexity
public class Solution {
    int max = Integer.MIN_VALUE;
    public int longestConsecutive(TreeNode root) {
        // write your code here
        f(root, 1);
        return max;
    }
    private void f(TreeNode root, int c){
        if(root == null) return;

        if(root.left != null && root.val + 1 == root.left.val){
            f(root.left, c+1);
        }
        else f(root.left, 1);
        if(root.right != null && root.val + 1 == root.right.val){
            f(root.right, c+1);
        }
        else f(root.right, 1);
        max = Math.max(max, c);
    }
}
