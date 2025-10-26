package Strings;

public class LargestOdd {

    static String largestOddNumber(String num)
    {
        int value = Integer.parseInt(num);
        int val2 = Integer.valueOf(num);

        int test = val2 - value;
        System.out.println(test);

        System.out.println(value+" "+val2);

        return num;

    }

    public static void main(String[] args) {
        String req = largestOddNumber("-52");

        //System.out.println(req);


    }
}
