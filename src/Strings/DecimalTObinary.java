package Strings;

public class DecimalTObinary {

    static String Convert(int x)
    {
        StringBuilder z = new StringBuilder();

       while(x != 0)
       {
        z.insert(0,x%2);
        x = x/2;
       }
        return new String(z);
    }

    public static void main(String[] args) {
        String x = Convert(16);
        System.out.println(x);

    }
}
