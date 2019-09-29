package P_107_二叉树的层次遍历_II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();

        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while (level.size() > 0){
            List<TreeNode> tmp = new ArrayList<>();
            List<Integer> resTmp = new ArrayList<>();
            level.forEach( node -> {
                if (node.left != null){
                    tmp.add(node.left);
                }
                if (node.right != null){
                    tmp.add(node.right);
                }
                resTmp.add(node.val);
            });

            res.add(0,resTmp);
            level = tmp;

        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println( 1 - 0.9);
        System.out.println( 1 - 0.8);
        System.out.println( 1 - 0.7);
        System.out.println( 1 - 0.6);
        System.out.println( 1 - 0.5);
        System.out.println( 1 - 0.4);
        System.out.println( 1 - 0.3);
        System.out.println( 1 - 0.2);
        System.out.println( 1 - 0.1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
