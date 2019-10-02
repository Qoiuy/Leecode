package P_897_递增顺序查找树;

public class Solution {
    public TreeNode increasingBST(TreeNode root) {

        if (root == null){
            return null;
        }

        TreeNode parent = increasingBST(root.left);
        if (parent != null){
            if (parent.right != null){
                TreeNode tmp = parent;
                while (tmp.right != null){
                    tmp = tmp.right;
                }
                tmp.right = root;
            }else {
                parent.right = root;
            }
            root.left = null;
        }
        root.right = increasingBST(root.right);
        return parent != null ? parent : root;

    }

    public static void main(String[] args) {
//        5,3,6,2,4,null,8,1,null,null,null,7,9

        TreeNode node1 =new TreeNode(1);
        TreeNode node2 =new TreeNode(2);
        TreeNode node3 =new TreeNode(3);
        TreeNode node4 =new TreeNode(4);
        TreeNode node5 =new TreeNode(5);
        TreeNode node6 =new TreeNode(6);
        TreeNode node7 =new TreeNode(7);
        TreeNode node8 =new TreeNode(8);
        TreeNode node9 =new TreeNode(9);
        node5.left = node3;
        node5.right =node6;
        node3.left = node2;
        node3.right = node4;
        node2.left = node1;
        node6.right = node8;
        node8.left = node7;
        node8.right = node9;


        TreeNode node = new Solution().increasingBST(node5);
        System.out.println(111);


    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
