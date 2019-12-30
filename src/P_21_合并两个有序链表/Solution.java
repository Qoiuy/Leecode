package P_21_合并两个有序链表;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null){
            return null;
        }

        if (l1 == null){
            return l2;
        }

        if (l2 == null){
            return l1;
        }

        //感觉串的位置有点多。如果我每次只考虑一个值呢？

        if (l1.val <= l2.val){
            ListNode l1Next = l1.next;
            l1.next = mergeTwoLists(l1Next,l2 );
            return l1;
        }
        ListNode l2Next = l2.next;
        l2.next = mergeTwoLists(l1,l2Next);
        return l2;

    }



    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}


