package list.linkedListCycle2;


import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution {

    /**
     * 遍历一个链表
     */
    public void traverseList(ListNode head){
        ListNode tmp = head;
        while (tmp.next != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
        System.out.println(tmp.val);
    }

    /**
     * 创建一个测试链表
     */
    public ListNode createList(){
        ListNode head = new ListNode(1);
        ListNode tmp2 = new ListNode(2);
        head.next = tmp2;
        ListNode tmp3 = new ListNode(3);
        tmp2.next = tmp3;
        ListNode tmp4 = new ListNode(4);
        tmp3.next = tmp4;
        ListNode tmp5 = new ListNode(5);
        tmp4.next = tmp5;

        tmp5.next = tmp2;
        return head;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.detectCycleUseSet(s.createList()).val);

    }

    public ListNode detectCycleUseSet(ListNode head) {
        if(head == null){
            return null;
        }
        //List=>Set
        HashSet<ListNode> set = new HashSet<>();
        ListNode i = head;
        while (i.next != null){
            if ( ! set.add(i)){
                return i;
            }
            i = i.next;
        }
        return null;
    }

}
