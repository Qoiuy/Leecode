package IP_1002_字母排序;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        String a, b, c;

        while (cin.hasNext()){
            a = cin.next();
            b = cin.next();
            c = cin.next();

            System.out.println(sortAlphabet(a, b, c));
        }

    }

    private static String sortAlphabet(String a, String b, String c) {
        int[] res = new int[]{stringToInt(a), stringToInt(b), stringToInt(c)};

        sorted(res, 0, res.length - 1 );

        StringBuffer stringBuffer = new StringBuffer();
        for (int i : res){
            stringBuffer.append(stringBuffer.length() == 0 ? "" : " ").append((char) (i + 'a'));
        }
        return stringBuffer.toString();
    }

    public static int stringToInt(String tmp){
        return tmp.charAt(0) - 'a';
    }



    private static void sorted(int[] arr, int low, int high) {
        if (low < high) {
            int middle = middle(arr, low, high);
            sorted(arr, low, middle - 1);
            sorted(arr, middle + 1, high);
        }

    }

    private static int middle(int[] arr, int low, int high) {
        int middle = arr[low];

        while (low < high) {
            while (low < high && arr[high] >= middle) --high;
            arr[low] = arr[high];
            while (low < high && arr[low] <= middle) ++low;
            arr[high] = arr[low];

        }
        arr[low] = middle;
        return low;
    }
}
