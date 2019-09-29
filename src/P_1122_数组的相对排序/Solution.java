package P_1122_数组的相对排序;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        List<Integer> resSort = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap();
        int[] res = new int[arr1.length];


        for (int i : arr2) {
            set.add(i);
            map.put(i, 0);
        }

        for (int i : arr1) {
            if (set.contains(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                resSort.add(i);
            }
        }


        AtomicInteger count = new AtomicInteger();
        for (int j : arr2){
            for (int i = 0; i < map.get(j); i++) {
                res[count.getAndIncrement()] = j;
            }
        }

        int tmp = count.get();
        resSort.forEach(p -> {
            res[count.getAndIncrement()] = p;
        });

        System.out.println("tmp: " + tmp + "  res.length: " + res.length);
        sorted(res, tmp, res.length - 1);

        return res;
    }

    public static void main(String[] args) {
        new Solution().relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6});
    }


    private static void sorted(int[] arr, int low, int high) {
        if (low < high) {
            int middle = middle(arr, low, high);
            sorted(arr, low, middle - 1);
            sorted(arr, middle + 1, high);
        }

    }

    private static int middle(int[] arr, int low, int high) {
        int middle = arr[low];

        while (low < high) {
            while (low < high && arr[high] >= middle) --high;
            arr[low] = arr[high];
            while (low < high && arr[low] <= middle) ++low;
            arr[high] = arr[low];

        }
        arr[low] = middle;
        return low;
    }

}
