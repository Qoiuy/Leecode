package P_933_最近的请求次数;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class RecentCounter {

    public RecentCounter(){

    }

    ArrayList<Integer> list = new ArrayList<>();

    public int ping(int t) {

        list.add(t);
        AtomicInteger count = new AtomicInteger();
        list.forEach(p ->{
            if ( t - 3000 <= p && p <= t  ){
                count.getAndIncrement();
            }
        });
        return count.get();
    }

    public static void main(String[] args) {
        RecentCounter obj= new RecentCounter();
        System.out.println(obj.ping(642));
        System.out.println(obj.ping(1849));
        System.out.println(obj.ping(4921));
        System.out.println(obj.ping(5936));
        System.out.println(obj.ping(5957));

//[null,1,2,1,2,3]
    }
}
