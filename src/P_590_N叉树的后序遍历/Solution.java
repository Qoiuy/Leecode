package P_590_N叉树的后序遍历;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Solution {

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        Stack<Node> parents = new Stack<>();

        Node node = root;
        while (node != null){
            // 有子节点 父节点压入parents 处理第一个子节点
            if (node.children != null && node.children.size() > 0){
                parents.push(node);
                node = node.children.get(0);
            } else {
                list.add(node.val);
                // 获取兄弟节点和父节点
                if (parents.size() == 0){
                    break;
                }
                Node parent = parents.pop();
                List<Node> brothers = null;


                if (parent.children != null && parent.children.contains(node)){
                    parent.children.remove(node);
                    brothers = parent.children;
                }

                // 遍历顺序依次为 兄弟节点 => 父节点 =>
                if (brothers != null && brothers.size() > 0){
                    node = brothers.get(0);
                    brothers.remove(node);
                    parents.push(parent);
                } else {
                    node = parent;
                }

            }

        }

        return list;
    }

    public static void main(String[] args) {


        System.out.println(
                new Solution().postorder(
                        new Node(1, new ArrayList<Node>() {{
                            add(new Node(10, new ArrayList<Node>() {{
                                add(new Node(5, null));
                                add(new Node(0, null));
                            }}));
                            add(new Node(3, new ArrayList<Node>() {{
                                add(new Node(6, null));
                            }}));
                        }})
                ).toString()
        );


    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
