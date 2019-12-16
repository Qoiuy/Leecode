package P_1266_访问所有点的最小时间;

public class Solution {

    public int minTimeToVisitAllPoints(int[][] points) {


        int sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x = Math.abs(points[i + 1][0] - points[i][0]);
            int y = Math.abs(points[i + 1][1] - points[i][1]);
            sum += (x > y ? x : y);
            System.out.println("sum :" + sum);
        }

        return sum;
    }
}
