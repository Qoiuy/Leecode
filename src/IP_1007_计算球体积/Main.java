package IP_1007_计算球体积;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            double d = cin.nextDouble();
            System.out.println(new DecimalFormat("0.000").format(calculateBall(d)));
        }

    }

    private static Double calculateBall(double r) {
        double aDouble = 3.1415927;
        return 4 * aDouble * r * r * r / 3.0;
    }


}
