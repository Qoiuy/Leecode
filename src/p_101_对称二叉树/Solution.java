package p_101_对称二叉树;

public class Solution {

    public boolean isSymmetric(TreeNode root) {

        if (root == null){
            return true;
        }

        return isSymmetric(root.left, root.right);

    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left == null &&  right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }

        if (left.val != right.val){
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
