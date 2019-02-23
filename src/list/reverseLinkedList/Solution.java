package list.reverseLinkedList;


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

        return head;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode head = solution.createList();

        ListNode result = solution.reverseList(head);

        solution.traverseList(head);
        solution.traverseList(result);


    }

    public ListNode reverseList(ListNode head) {
         //思路
        //resultHead -> 1
        //resultHead -> 2 -> 1
        //resultHead -> 3 -> 2 -> 1
        //resultHead -> 4 -> 3 -> 2 -> 1
        //resultHead -> 5 -> 4 -> 3 -> 2 -> 1

        //处理nullpoint
        if(head == null || head.next == null){
            return head;
        }

        ListNode result = new ListNode(0);

        ListNode i = head;
        while(i.next != null){
            //处理数据
            ListNode tmp = new ListNode(i.val);
            tmp.next = result.next;
            result.next = tmp;
            i = i.next;
        }
        //处理最后一个数据
        ListNode tmp = new ListNode(i.val);
        tmp.next = result.next;
        result = tmp;

        return result;
    }
}
