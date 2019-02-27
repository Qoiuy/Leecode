package tree.lowestCommonAncestorOfABinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l = new TreeNode(5);
        TreeNode r = new TreeNode(1);
        TreeNode ll = new TreeNode( 6);
        TreeNode lr = new TreeNode( 2);
        TreeNode lrl = new TreeNode(0);
        TreeNode lrr = new TreeNode(8);
        TreeNode rl = new TreeNode(7);
        TreeNode rr = new TreeNode(4);
        root.left = r;
        root.right = l;
        l.left = ll;
        l.right = lr;
        lr.left = lrl;
        lr.right = lrr;
        r.left = rl;
        r.right = rr;

        Solution solution = new Solution();
        System.out.println(solution.lowestCommonAncestor(root, lrl, ll).val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //终止条件 找到做节点或者右节点
        if(root == null || root == p || root == q) {
            return root;
        }
        //从左节点里面找
        root.left = lowestCommonAncestor(root.left, p, q);
        //从右节点里找
        root.right = lowestCommonAncestor(root.right, p, q);
        //如果左节点为空 处理右节点
        if(root.left == null){
            return root.right;
        }else {
            //如果右节点为空 处理左节点
            if(root.right == null){
                return root.left;
            }else {
                //否则处理父节点
                return root;
            }
        }
    }
}
