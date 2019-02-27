package tree.validateBinarySearchTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public static void main(String[] args) {



        TreeNode root = new TreeNode(0);
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(root));



//        TreeNode root = new TreeNode(2);
//        TreeNode l = new TreeNode(1);
//        root.left = l;
//        TreeNode r = new TreeNode(3);
//        root.right = r;
//        Solution solution = new Solution();
//        System.out.println(solution.isValidBST(root));


//        //[5,1,4,null,null,3,6]
//        TreeNode root = new TreeNode(5);
//        TreeNode l = new TreeNode(1);
//        root.left = l;
//        TreeNode r = new TreeNode(4);
//        root.right = r;
//        TreeNode rl = new TreeNode(3);
//        r.left = rl;
//        TreeNode rr = new TreeNode(6);
//        r.right = rr;
//
//        Solution solution = new Solution();
//        System.out.println(solution.isValidBST(root));
    }



    private double val = - Double.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        //左节点处理
        if(!isValidBST(root.left)){
            return false;
        }else {
            // 父节点处理
            if(root.val > val){
                val = root.val;
                //右节点处理
                if(!isValidBST(root.right)){
                    return false;
                }else {
                    return true;
                }
            }else {
                val = root.val;
                return false;
            }
        }
    }




}
