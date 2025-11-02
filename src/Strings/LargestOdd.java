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

    /*
    Problems with the above algorithm
    Integer.parseInt(num): The problem specifies that the string S represents a large integer.
    Your code will fail with a NumberFormatException if the string is longer than 9 or 10 digits (e.g., "1234567890123").
    The problem is designed to be solved without converting the entire string to a number.

    Incorrect Logic: Your code attempts to find the largest odd digit within the number (e.g., for "314", it would return "3").
    The problem asks for the largest-valued odd substring (for "314", the correct answer is "31").

    Space Complexity: Your use of new int[len] creates an array of size O(N), but the problem asks for O(1) auxiliary space.
     */


    static void ConvertStringTOInteger(String s3)
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

        static String mostEfficient(String s) {
        // code here
        int len = s.length()-1;
        char c;
        int digits;

        for(int i=len; i>=0; i--)
        {
            c = s.charAt(i);
            digits = c - '0';

            if(digits%2 != 0)
            {
                String required = s.substring(0,i+1);
                return required;

            }
        }

        return "";
    }

    public static void main(String[] args) {
        //String req = largestOddNumber("-40234");

        ConvertStringTOInteger("12303");

        String efficient = mostEfficient("1230");
        System.out.println(efficient);

    }
}