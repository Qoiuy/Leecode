package bfsdfs.minimumDepthOfBinaryTree;

import sun.text.normalizer.Trie;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public static void main(String[] args) {

        TreeNode root  = new TreeNode(3);
        TreeNode l  = new TreeNode(9);
        TreeNode r  = new TreeNode(20);
        TreeNode rl  = new TreeNode(15);
        TreeNode rr  = new TreeNode(7);

        root.left = l; root.right = r; r.left = rl; r.right = rr;

        Solution s  = new  Solution();

        System.out.println(s.minDepth(root));
    }
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        if(root.left == null){
            return 1 + (minDepth(root.right));
        }
        if(root.right == null){
            return 1+ (minDepth(root.left));
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);


        return Math.min(left + 1, right+1);

    }
}
