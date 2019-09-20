package P_1051_高度检查器;

public class Solution {

    public int heightChecker(int[] heights) {

        int[] newArr = init(heights);

        sorted(newArr, 0, newArr.length -1);

        int count = 0;
        for (int i = 0; i < heights.length; i ++){
            if (heights[i] != newArr[i]){
                count++ ;
            }
        }

        return count;
    }

    private int[] init(int[] heights) {
        int[] sort = new int[heights.length];
        System.arraycopy(heights, 0, sort, 0, heights.length);
        return sort;
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
