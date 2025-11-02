package Strings;
import java.util.Arrays;

public class LargestOdd {

    static String largestOddNumber(String num)
    {
        int len = num.length();
        int val = Integer.parseInt(num);
        //int val2 = Integer.valueOf(num);

        if(val<0)
        {
            val = Math.abs(val);
        }

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
                System.out.println(num);
                return "NO";
            }

            else {
            Arrays.sort(arr);
            return String.valueOf(arr[len-1]); }
        }
    }


    static void largestOddNumber2(String s3)
    {
        int number = 0;
        int len = s3.length();
        char c;
        int num = 0;

            for(int i=0; i<len; i++)
            {
                c = s3.charAt(i) ;
                num = c - '0';

                number = (number * 10) + num;

            }

            System.out.println("Conversion from String to integer manually "+ number);
    }


    public static void main(String[] args) {
        String req = largestOddNumber("-40234");

        largestOddNumber2("1230");

        System.out.println(req);

    }
}