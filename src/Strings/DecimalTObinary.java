package Strings;

public class DecimalTObinary {

    static String Convert(int x)
    {
        StringBuilder z = new StringBuilder();
        z.append(1).append(1);
        System.out.println(z);
        String test = new String(z);
        System.out.println(test);

        return test;


    }

    public static void main(String[] args) {
        String x = Convert(7);
        System.out.println(x);

    }
}
