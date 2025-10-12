package Strings;

public class StringsNumbers {
    static void StringTONumber(String str)
    {
//        char c = str.charAt(0);
//        int x = c;
//        System.out.println(x);

        char xx = 65;
        System.out.println(xx);

        int len = str.length();
        for(int i=0; i<len; i++)
        {
            int z = str.charAt(i);
            System.out.println(z);
        }
    }

    static void PrintNumbertoCharacters(char c5, char c6)
    {
        int m = c5;
        int m2 = c6;
        //System.out.println(m2);

        for(int i=m; i<=m2; i++)
        {
            char m3 = (char)i;
            System.out.print(m3+" ");

        }
    }

    public static void main(String[] args) {
        String s = "Hello";
        StringTONumber(s);

        PrintNumbertoCharacters('a','h');

    }
}
