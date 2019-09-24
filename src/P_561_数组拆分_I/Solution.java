package P_561_数组拆分_I;

public class Solution {


    public int arrayPairSum(int[] nums) {

        sorted(nums, 0, nums.length - 1);

        int count = 0;
        for ( int i = 0; i < nums.length; i = i + 2){
            count += nums[i];
        }
        return count;
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

    private static  void sort(int[] arr, int low, int high){
        if (low < high){
            int middle = middle(arr, low, high);
            sorted(arr, low, middle - 1);
            sorted(arr, middle + 1, high);
        }
    }
    private static  int mid(int[] arr, int low, int high){
        int middle = arr[low];
        while (low < high){
            while (low < high && arr[high] >= middle) --high;
            arr[low] = arr[high];
            while (low < high && arr[low] <= middle) ++ low;
            arr[high] = arr[low];
        }
        arr[low] = middle;
        return low;
    }
}
