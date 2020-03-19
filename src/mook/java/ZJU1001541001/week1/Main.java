package mook.java.ZJU1001541001.week1;

import java.util.Scanner;

/**
 * 温度转换
 * 教老弟的代码
 * @author Lilac
 * 2020-03-19
 */
public class Main {

    public static void main(String[] args) {
        double C ;
        int F ;

        Scanner in = new Scanner(System.in);
        F = in.nextInt();
        C = (F - 32 ) / 9.0 * 5;
        System.out.println((int)C);
    }
}
