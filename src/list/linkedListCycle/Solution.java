package list.linkedListCycle;


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

        return head;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.hasCycleUseSet(s.createList()));
        System.out.println(s.hasCycleLikeRunner(s.createList()));

    }

    public boolean hasCycleUseSet(ListNode head) {
        if(head == null){
            return false;
        }
        //List=>Set
        HashSet<ListNode> set = new HashSet<>();
        while (head.next != null){
            if ( ! set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleLikeRunner(ListNode head) {

        if(head == null){
            return false;
        }
        //模拟操场扣圈 fastRunner 跑的快的 slowRunner 跑的慢的
        ListNode fastRunner = head, slowRunner = head;

        //起点不算 使用do while
        do {
            slowRunner = slowRunner.next;
            if(fastRunner != null && fastRunner.next != null && fastRunner.next.next != null){
                fastRunner = fastRunner.next.next;
            } else {
                return false;
            }

            //扣圈了就返回true
            if(slowRunner.equals( fastRunner)){
                return true;
            }
        }while (slowRunner.next != null);

        return false;
    }
}
