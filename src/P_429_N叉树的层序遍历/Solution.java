package P_429_N叉树的层序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> levelOrder(Node root) {

        if (root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();


        List<Node> list = new ArrayList<>();
        list.add(root);
        while (list.size() > 0 ){
            List<Node> tmpNode = new ArrayList<Node>();
            List<Integer> tmp = new ArrayList<>();
            list.forEach(p -> {
                tmp.add(p.val);
                if (p.children != null){
                    tmpNode.addAll(p.children);
                }
            });
            res.add(tmp);
            list = tmpNode;

        }

        return res;



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
