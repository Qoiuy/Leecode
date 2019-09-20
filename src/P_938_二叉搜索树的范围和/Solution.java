package P_938_二叉搜索树的范围和;

public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) {
            return 0;
        }
        int val = L <= root.val && root.val <= R ? root.val : 0;

        return val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}