package P_203_移除链表元素;

import Constant.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if ( head == null){
            return null;
        }

        // 执行删除
        if (head.next != null && head.next.val == val){
            head.next = removeElements(head.next.next, val);
        } else {
            head.next = removeElements(head.next, val);
        }

        return head.val ==  val ? head.next : head;

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(6);

        node1.next = node2;
        node2.next = node7;
        node7.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        print(node1);
        ListNode node = new Solution().removeElements(node1, 6);
        print(node);

    }


    public static void print(ListNode node) {

        if (node == null){
            System.out.println("");
            return;
        }
        System.out.printf(node.val + " -> ");
        print(node.next);
    }
}

