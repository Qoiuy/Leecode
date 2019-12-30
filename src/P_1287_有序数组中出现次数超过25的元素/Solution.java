package P_1287_有序数组中出现次数超过25的元素;

public class Solution {

    public int findSpecialInteger(int[] arr) {
        int currNum = -1, currSub = 0 ;

        for (int i = 0; i < arr.length; i++){
            if (currNum == -1){
                currNum = arr[i];
            }
            if (currNum != arr[i]){
                currNum = arr[i];
                currSub = i;
            }else {
                if ((i - currSub) >= arr.length /4){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
