package P_1290_二进制链表转整数;

public class Solution {

    public int getDecimalValue(ListNode head) {

        return calcul(head);

    }

    private int calcul(ListNode end) {
        ListNode tmp = end;
        int res = 0;
        while (tmp != null) {
            res = (res << 1) + tmp.val;
            tmp = tmp.next;
        }
        return res;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
