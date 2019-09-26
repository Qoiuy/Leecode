package IP_1009_第几天;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            System.out.println(whichDay(cin.next()));
        }

    }

    private static Integer whichDay(String day) {

        String[] days = day.split("/");

        int count = 0;
        for (int i = 1; i <= Integer.parseInt(days[1]) - 1; i++) {
            if (mouth.containsKey(i)) {
                count += mouth.get(i);
            } else if (Integer.parseInt(days[0]) % 4 != 0) {
                count += 28;
            } else if (Integer.parseInt(days[0]) % 400 == 0) {
                count += 29;
            } else if (Integer.parseInt(days[0]) % 100 == 0) {
                count += 28;
            } else {
                count += 29;
            }

        }

        count += Integer.parseInt(days[2]);

        return count;
    }

    static Map<Integer, Integer> mouth = new HashMap<Integer, Integer>() {{
        put(1, 31);
        put(3, 31);
        put(4, 30);
        put(5, 31);
        put(6, 30);
        put(7, 31);
        put(8, 31);
        put(9, 30);
        put(10, 31);
        put(11, 30);
        put(12, 31);
    }};

}
