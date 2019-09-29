package P_876_链表的中间结点;

public class Solution {

    public ListNode middleNode(ListNode head) {


        int count = 0;
        ListNode tmp = head,res = head;
        while (tmp.next != null){
            count ++ ;

            if (count % 2 == 1){
                 res = res.next;
            }
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
