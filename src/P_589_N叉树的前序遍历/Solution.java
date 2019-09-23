package P_589_N叉树的前序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (stack != null && stack.size() != 0){
            Node node = stack.pop();
            if (node != null){
                list.add(node.val);
            }
            if (node != null && node.children != null && node.children.size() > 0){
                for (int i = node.children.size() - 1; i >= 0; i--){
                    stack.push(node.children.get(i));
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {


        System.out.println(
                new Solution().preorder(
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
