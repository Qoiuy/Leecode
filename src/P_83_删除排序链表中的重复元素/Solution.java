package P_83_删除排序链表中的重复元素;

import java.util.List;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }

        //删除掉和当前节点相同的节点
        while (head.next != null && head.val == head.next.val){
            head.next = head.next.next;
        }

        deleteDuplicates(head.next);

        return head;
    }

    public static void main(String[] args) {
        test1();


    }

    private static void test1() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next =listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        System.out.println(new Solution().deleteDuplicates(listNode1));

        ListNode tmp = listNode1;
        while (tmp.next != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
