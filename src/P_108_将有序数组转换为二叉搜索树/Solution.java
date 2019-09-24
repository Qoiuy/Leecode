package P_108_将有序数组转换为二叉搜索树;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        if (nums.length == 1){
            return new TreeNode(nums[0]);
        }
//        if (nums.length == 2){
//            TreeNode node = new TreeNode(nums[0]);
//            node.right = new TreeNode(nums[1]);
//        }


        TreeNode node = new TreeNode(nums[nums.length / 2]);
        int[] preArr = new int[nums.length / 2], sufArr = new int[nums.length - (nums.length / 2 ) - 1];
        System.arraycopy(nums, 0, preArr, 0, nums.length / 2);
        System.arraycopy(nums, nums.length / 2 + 1, sufArr, 0, nums.length - (nums.length / 2 ) - 1);
        node.left = sortedArrayToBST(preArr);
        node.right = sortedArrayToBST(sufArr);
        return  node;

    }

    public static void main(String[] args) {

        new Solution().sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
