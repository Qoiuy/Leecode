package P_1281_整数的各位积和之差;

public class Solution {

    public int subtractProductAndSum(int n) {

        int product = 1, sum = 0;

        while (n >= 10){
            int tmp = n % 10;
            product *= tmp;
            sum += tmp;
            n = n / 10;
        }
        product *= n;
        sum += n;
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().subtractProductAndSum(234));;
    }
}
