package IP_1001_整数求和;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] ss = str.split(" ");
//
//        System.out.println(Integer.parseInt(ss[1]) + Integer.parseInt(ss[2]));


        Scanner cin = new Scanner(System.in);
        int a, b;
        while (cin.hasNext()){
            a = cin.nextInt(); b = cin.nextInt();
            System.out.println(a + b);
        }

    }
}
