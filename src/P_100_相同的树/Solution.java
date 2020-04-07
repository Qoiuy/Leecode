package P_100_相同的树;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //极限值 null 值 处理
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }

        if (p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);


    }

    public static void main(String[] args) {

        test1();

    }

    private static void test1() {
        TreeNode treeNodeA1 = new TreeNode(1);
        TreeNode treeNodeA2 = new TreeNode(2);
        TreeNode treeNodeA3 = new TreeNode(3);


        TreeNode treeNodeB1 = new TreeNode(1);
        TreeNode treeNodeB2 = new TreeNode(2);
        TreeNode treeNodeB3 = new TreeNode(3);

        treeNodeA1.left = treeNodeA2;
        treeNodeA1.right = treeNodeA3;

        treeNodeB1.left = treeNodeB2;
        treeNodeB1.right = treeNodeB3;

        System.out.println(new Solution().isSameTree(treeNodeA1, treeNodeB1));
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
