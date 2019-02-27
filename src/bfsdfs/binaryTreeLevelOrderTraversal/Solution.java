package bfsdfs.binaryTreeLevelOrderTraversal;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        Solution solution = new Solution();

        List<List<Integer>> res = solution.levelOrder(root);
        for( List<Integer> tmp : res){
            for( Integer tmp1 : tmp){
                System.out.printf(tmp1 + ", ");
            }
            System.out.println("");
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        //处理第一层
        List<TreeNode> nextLevel ,thisLevel = Arrays.asList(root);

        while (!thisLevel.isEmpty()){
            //
            List<Integer> everyLevelResult = new ArrayList<>();
            nextLevel = new ArrayList<>();
            for(TreeNode tmp : thisLevel){
                if(tmp != null){
                    everyLevelResult.add(tmp.val);
                    nextLevel.add(tmp.left);
                    nextLevel.add(tmp.right);
                }
            }
            if(everyLevelResult.size() > 0){
                result.add(everyLevelResult);
            }
            thisLevel = nextLevel;
        }
        return result;

    }
}
