package P_628_三个数的最大乘积;

public class Solution {

    public static final int max = 1001;
    public static final int min = -1001;

    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        //两条线处理
        MaxABC abc = new MaxABC();
        MinMinus de = new MinMinus();
        for (int i : nums) {
            if (abc.is(i)) {
                abc.change(i);
            }
            if (de.is(i)) {
                de.change(i);
            }
        }
        System.out.println("a: "+abc.a +", b: "+ abc.b +" , c:"+ abc.c + " ,d : "+ de.d+", e : "+ de.e);
        return max(abc.a, abc.c, abc.b, de.d, de.e);

    }


    public int max(int a, int b, int c, int d, int e) {
        if (d == max && e == max){
            return a * b * c;
        }

        if (a == min) {
            a = 1;
        }
        if (b == min) {
            b = 1;
        }
        if (c == min) {
            c = 1;
        }
        if (d == max) {
            d = 1;
        }
        if (e == max) {
            e = 1;
        }
        return Math.max(Math.max(Math.max(a * b * c, a * d * e), b * d * e), c * d * e);
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().maximumProduct(new int[]{1, 2, 3, 4}));
//        System.out.println(new Solution().maximumProduct(new int[]{-100, -98, -1, 2, 3, 4}));
//        System.out.println(new Solution().maximumProduct(new int[]{1,1,2,2}));
        System.out.println(new Solution().maximumProduct(new int[]{0,0,0,4}));
    }
}

//De 负数 且两个最小值
class MinMinus {


    int d = max;
    int e = max;
    public static final int max = 1001;


    public boolean is(int i) {
        // 第一条 负数且为最小值
        return i < 0 && (i <= e || i <= d);
    }

    public void change(int i) {
        if (d == max) {
            d = i;
        } else if (e == max) {
            e = i;
        } else if (d < e) {
            e = i;
        } else {
            d = i;
        }
    }
}

// 最大的三个值
class MaxABC {
    int a = min;
    int b = min;
    int c = min;
    public static final int min = -1001;

    public boolean is(int i) {
        return i >= a || i >= b || i >= c;
    }

    public void change(int i) {
        if (a == min) {
            a = i;
        } else if (b == min) {
            b = i;
        } else if (c == min) {
            c = i;
        } else if (c >= a && b >= a) {
            a = i;
        } else if (c >= b && a >= b) {
            b = i;
        } else {
            c = i;
        }
    }

}