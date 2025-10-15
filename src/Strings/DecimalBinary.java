package Strings;

public class DecimalBinary {

    static String Convert1(int x)
    {
        // Given any integer convert it to binary and return it in string format
        StringBuilder z = new StringBuilder();

       while(x != 0)
       {
        z.insert(0,x%2); // Inserts elements to the 0th index pushing the current elements to the right
        x = x/2;
       }
        return new String(z);
    }

    static int Convert2(String str)
    {
        // Given any Binary in sring format covert it to it`s equivalent decimal and return in integer
        return 1;
    }

    public static void main(String[] args) {
        String x = Convert1(16);
        System.out.println(x);

        int res = Convert2("1000");

    }
}
