package IP_1004_输出入门;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int a, b;

        while (cin.hasNext()) {
            a = cin.nextInt();
            b = cin.nextInt();

            if (a == 0 && b == 0) {
                return;
            }
            System.out.println((a + b) + "\n");
        }

    }

}
