package P_559_N叉树的最大深度;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int maxDepth(Node root) {

        if (root == null){
            return 0;
        }

        if (root.children != null && root.children.size() > 0){
            int max = 0;
            for (Node p : root.children) {
                int maxDepth = maxDepth(p);
                max = (maxDepth > max) ? maxDepth : max;
            }
            return max + 1;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(
        new Solution().maxDepth(new Node(1, new ArrayList<Node>(){{
            add(new Node(3, new ArrayList<Node>(){{
                add(new Node(5, null));
                add(new Node(6, null));}}));
            add(new Node(2, null));
            add(new Node(4, null));
        }})));
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
