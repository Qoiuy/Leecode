package tmpCalculNumber;

public class Result {

    public static void main(String[] args) {
        Integer[] number = new Integer[]{39,64,90,77,85,82,80,85,84,89,91,105,85,92,71,63,65,53,53,56,58,43,41,47,38,29,42,36,46,54,53,46,43,44,40,46,32,50,55,58,64,50,52,74,81,79,70,50,3 };

        Integer result = 0;
        for (Integer i = 0; i <  number.length ; i++
             ) {
            result += number[i];
        }
        System.out.println(result);
    }
}
