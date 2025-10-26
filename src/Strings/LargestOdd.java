package Strings;
import java.util.Arrays;

public class LargestOdd {

    static String largestOddNumber(String num)
    {
        int len = num.length();
        int val = Integer.parseInt(num);
        //int val2 = Integer.valueOf(num);

        int lastdig ;
        int count = 0;
        int[] arr = new int[len];

        if(val % 2 != 0)
            return num;

        else {
            while (val > 0) {
                lastdig = val % 10;

                val = val / 10;

                if (lastdig % 2 != 0) {
                    count++;
                    arr[count - 1] = lastdig;
                }
            }
            if(count == 0)
            {
                return "";
            }

            else {
            Arrays.sort(arr);
            return String.valueOf(arr[len-1]); }
        }
    }

    public static void main(String[] args) {
        String req = largestOddNumber("7");

        System.out.println(req);

    }
}