package swap_nodes_in_pairs;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    /**
     * 遍历一个链表
     */
    public static void traverseList(ListNode head){
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
    public static ListNode createList(){
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
}

public class Solution {


    public static void main(String[] args) {
        ListNode head = ListNode.createList();
        Solution solution = new Solution();
        ListNode result = solution.swapPairs2(head);
        ListNode.traverseList(result);
    }

    public ListNode swapPairs2(ListNode head) {
        // 转换一下链表结构
        // 1(head) -> 2 -> 3 -> 4 -> 5
        // newHead -> 1 -> 2 -> 3 -> 4 -> 5
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode i = newHead;
        // newHead -> 1 -> 2 => i=newHead
        // 2 -> 3 -> 4 => i=2
        while ( i != null && i.next != null && i.next.next != null){
            ListNode tmpA = i.next; //1
            ListNode tmpB = i.next.next;//2

            //newHead ------|
            //      1-----> 2 -> 3 -> 4 -> 5
            i.next = tmpB;

            //newHead -> 2 -> 3 -> 4 -> 5
            //      1---------|
            tmpA.next = tmpB.next;

            //newHead -> 2 -> 1 -> 3 -> 4 -> 5
            tmpB.next = tmpA;

            i = i.next.next;
        }

        return newHead.next;

    }
    public ListNode swapPairs(ListNode head) {

        //坑 22交换指 12换 34换 56换   如果12345 只交换12 34
        //坑 交换节点而不是交换节点内容

        //思路
        //head=1 -> 2 -> 3 -> 4 -> 5
        //head=2 -> 1 ...
        //head=2 -> 1 -> 4 -> 3 ...

        //先处理链表头部
        ListNode result = new ListNode(0);
        if(head != null && head.next != null){
            result = head.next;
        }else {
            return head;
        }

        ListNode i = head;
        ListNode pre = head.next;
        while (i != null && i.next != null && i.next.next != null ){
            ListNode tmpA = i ;
            ListNode tmpB = i.next;

            tmpA.next = tmpA.next.next;
            tmpB.next = tmpA;
            pre.next = tmpB;

            pre = i;
            i = i.next;
        }
        return result;
    }
}
