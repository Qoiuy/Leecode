package list.reverseNodesInKGroup;

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
            System.out.print(tmp.val);
            tmp = tmp.next;
        }
        System.out.print(tmp.val + "\n");

    }

    /**
     * 创建一个测试链表
     */
    public static ListNode createList(){
        ListNode head = new ListNode(1);
        ListNode tmp2 = new ListNode(2);
        head.next = tmp2;
//        ListNode tmp3 = new ListNode(3);
//        tmp2.next = tmp3;
//        ListNode tmp4 = new ListNode(4);
//        tmp3.next = tmp4;
//        ListNode tmp5 = new ListNode(5);
//        tmp4.next = tmp5;

        return head;
    }
}

public class Solution {


    public static void main(String[] args) {
        ListNode head = ListNode.createList();
        Solution solution = new Solution();
        ListNode result = solution.reverseKGroup(head, 2);
        ListNode.traverseList(result);
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        //newHead 用来记录上一个节点
        ListNode newHead = new ListNode(0), result = null;
        newHead.next = head;

        if(!judgeNodeCanRun(newHead, k)){
            return head;
        }

        while ( judgeNodeCanRun(newHead, k) ){
            head = reverseKNode(head, k);

            //用来记录返回值
            if(result == null){
                result = head;
            }

            newHead.next = head;
            newHead = stepKNode(newHead, k);


            head = stepKNode(head, k);
        }

        return result;

    }

    //向前跳转K步
    public ListNode stepKNode(ListNode root, int k){
        for(int i = 0; i < k; i ++){
            root = root.next;
        }
        return root;
    }
    //这里是整体反转
    public ListNode reverseKNode(ListNode root, int k){

        // 1->2->3->4->5
        // head -> 1->2->3->4->5

        // head -> 2->3->4->5 newHead ->1
        // head -> 3->4->5 newHead ->2->1
        // head -> 4->5 newHead ->3->2->1

        // newHead -> 3 -> 2 -> 1 -> 4 ->5
        ListNode head = new ListNode(0), newHead = new ListNode(0);


        for (int i = 0 ; i < k; i ++  ){

            head.next = root.next;

            if(newHead.next != null){
                //newHead ->1
                //newHead->1    2->1
                //newHead ->2->1
                root.next =newHead.next;
                newHead.next = root;
            }else {
                root.next = null;
                newHead.next = root;
            }

            root = head.next;
        }

        ListNode tmp = stepKNode(newHead, k);
        tmp.next = head.next;

        return newHead.next;
    }

    public boolean judgeNodeCanRun(ListNode root, int k){
        //k =1  => i != null && i.next != null
        //k =1  => i != null && i.next != null && i.next.next != null
        if (root == null){
            return false;
        }
        for (int i = 0; i < k ; i ++){
            if(root.next == null){
                return false;
            }
            root = root.next;
        }
        return true;
    }

}
