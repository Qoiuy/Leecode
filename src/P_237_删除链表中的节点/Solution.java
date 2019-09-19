package P_237_删除链表中的节点;

import Constant.ListNode;

public class Solution {

    public void deleteNode(ListNode node) {

        if (node != null  && node.next != null){

            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}

