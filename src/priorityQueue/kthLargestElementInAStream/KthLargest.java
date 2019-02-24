package priorityQueue.kthLargestElementInAStream;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {
        int[] tmp = {0};
        KthLargest kthLargest = new KthLargest(2,tmp);
        kthLargest.print();
        System.out.println(kthLargest.add(-1));
        kthLargest.print();
        System.out.println(kthLargest.add(1));
        kthLargest.print();
        System.out.println(kthLargest.add(-2));
        kthLargest.print();
        System.out.println(kthLargest.add(-4));
        kthLargest.print();
        System.out.println(kthLargest.add(3));
        kthLargest.print();

    }
    public void print(){
        for (Integer tmp: priorityQueue) {
            System.out.printf(tmp + ", ");
        }
        System.out.println("");
    }


    PriorityQueue<Integer> priorityQueue ;
    int size ;
    public KthLargest(int k, int[] nums) {
        priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        size = k;
        for(int i = 0; i < nums.length; i++){
            add(nums[i]);
        }
    }

    public int add(int val) {

        if(priorityQueue.size() < size ){
            priorityQueue.add(val);
        } else  if(priorityQueue.peek() < val){
            priorityQueue.poll();
            priorityQueue.offer(val);
        }
        return priorityQueue.peek();
    }
}
