package P_700_二叉搜索树中的搜索;

public class Solution {


    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null){
            return null;
        }

        if (root.val == val){
            return root;
        }
        TreeNode left = searchBST(root.left, val);
        if (left != null){
            return left;
        }
        TreeNode right = searchBST(root.right, val);
        if (right != null){
            return right;
        }
        return null;
    }



    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
