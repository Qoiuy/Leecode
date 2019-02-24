package stack.implementQueueUsingStacks;

import java.util.Stack;

public class MyQueue {


    //push =>inputStack
    //pop peek =>outputStack
    Stack<Integer> inputStack, outputStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        checkInputStack(inputStack, outputStack);
        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        checkOutputStack(inputStack, outputStack);
        return outputStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        checkOutputStack(inputStack, outputStack);
        return outputStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(inputStack.empty() && outputStack.empty()){
            return true;
        }
        return false;
    }

    //调换s1=> s2
    public void changeStack(Stack<Integer> s1, Stack<Integer> s2){
        while (!s1.empty()){
            s2.push( s1.pop());
        }
    }

    //检查输入栈 保存输入栈有数据
    public void checkInputStack(Stack inputStack, Stack outputStack){
        if (!outputStack.empty()){
           changeStack(outputStack, inputStack);
        }
    }

    //检查输出栈 保证输出栈有数据
    public void checkOutputStack(Stack inputStack, Stack outputStack){
        if (!inputStack.empty()){
            changeStack(inputStack, outputStack);
        }
    }

}
