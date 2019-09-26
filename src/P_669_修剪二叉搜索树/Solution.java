package P_669_修剪二叉搜索树;

public class Solution {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode trimBST(TreeNode root, int L, int R) {


        if (root == null){
            return null;
        }
        if (root.val < L){
            return trimBST(root.right, L, R);
        }else if (R < root.val){
            return trimBST(root.left, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;

    }



    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node0 = new TreeNode(0);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node3.left = node0;
        node3.right = node4;
        node0.right = node2;
        node2.left = node1;
        System.out.println(new Solution().trimBST(node3, 1, 3));

    }
}
