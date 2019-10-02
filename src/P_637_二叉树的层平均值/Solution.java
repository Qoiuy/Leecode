package P_637_二叉树的层平均值;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        List<TreeNode> tmp = new ArrayList<>();
        tmp.add(root);

        while (tmp.size() > 0) {
            List<TreeNode> tmp1 = new ArrayList<>();
            double count = 0;
            int nodeCount = 0;
            for (TreeNode node : tmp) {

                if (node != null) {
                    nodeCount ++;
                    count += node.val;
                    tmp1.add(node.left);
                    tmp1.add(node.right);
                }
            }
            if (nodeCount > 0){
                list.add(count / nodeCount);
            }

            tmp = tmp1;
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;
        System.out.println(new Solution().averageOfLevels(node3).toString());
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
