package P_155_最小栈;

import java.util.ArrayList;
import java.util.List;

class MinStack {

    List<Integer> list ;
    /** initialize your data structure here. */
    public MinStack() {
        list =  new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (Integer i : list){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */