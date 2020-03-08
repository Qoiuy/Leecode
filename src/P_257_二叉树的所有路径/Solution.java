package P_257_二叉树的所有路径;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        traverse(root, new StringBuffer());
        return result;
    }

    private void traverse(TreeNode root, StringBuffer stringBuffer) {
        if (root == null) {
            return;
        }

        stringBuffer.append(preStr(stringBuffer)).append(root.val);
        StringBuffer newStringBuffer = new StringBuffer(stringBuffer);

        if (root.left == null && root.right == null) {
            result.add(stringBuffer.toString());
            return;
        }

        traverse(root.left, stringBuffer);
        traverse(root.right,newStringBuffer);
    }

    private String preStr(StringBuffer stringBuffer) {
        if (stringBuffer.length() == 0) {
            return "";
        }
        return "->";
    }



    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.right = t5;
        System.out.println(new Solution().binaryTreePaths(t1));
    }
}
