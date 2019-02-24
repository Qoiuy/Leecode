package queue.implementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {


    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(queue.isEmpty() ){
            return queue.poll();
        }
        //创建临时queue
        Queue<Integer> tmp = new LinkedList<>();
        while (!queue.isEmpty() && queue.size() > 1){
            tmp.add(queue.poll());
        }

        //获取道最后一个元素
        Integer result = queue.poll();

        //将数据重新放回queue
        queue = tmp;
        return result;
    }

    /** Get the top element. */
    public int top() {
        if(queue.isEmpty() ){
            return 0;
        }
        //创建临时queue
        Queue<Integer> tmp = new LinkedList<>();

        //获取道最后一个元素
        Integer result = 0;

        while (!queue.isEmpty() ){
            tmp.add(result = queue.poll());
        }



        //将数据重新放回queue
        queue = tmp;
        return result;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {

        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        int param_3 = obj.top();
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
    }


}
