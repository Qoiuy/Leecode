package bitwiseComplement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 求二进制的补码
 * https://leetcode-cn.com/contest/weekly-contest-128/problems/complement-of-base-10-integer/
 */
public class Solution {

    private static ArrayList<Integer> array = new ArrayList() ;

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.bitwiseComplement(608863042));
    }

    public int bitwiseComplement(int N) {

        if(N == 0){
            return 1;
        }

        //创建默认数组
        createArray();
        // 获取1的位置
        HashSet<Integer> set = dealNumber(N);

        int result = 0;
        for(int i = 0; N >= array.get(i) ; i ++ ){
            int tmp = array.get(i);
            if(!set.contains(tmp)){
                result += tmp;
            }
        }
        return result;
    }

    public static HashSet<Integer> dealNumber(int i){
        HashSet<Integer> array1Number = new HashSet() ;
        int tmp ;
        while ((tmp = get1Number(i) ) > 0){
            array1Number.add(tmp);
            i -= tmp;
        }
        return array1Number;
    }

    /**
     * 获取值为1的位置
     * @param i
     * @return
     */
    public static int get1Number(int i){
        return i & (-i);
    }

    /**
     * 数组里面存储
     * 范围 0 <= N < 10^9
     * 所有2的幂次的数  如 1=2^0, 2=2^1, 4=2^2
     */
    public static void createArray(){
        for (int i = 0; ; i++){
            int tmp = (int) Math.pow(2, i);
            if(tmp >= 1000000000){
                array.add(tmp);
                break;
            }
            array.add(tmp);
        }

    }


}
