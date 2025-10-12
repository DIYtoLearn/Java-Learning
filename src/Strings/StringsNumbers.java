package Strings;

public class StringsNumbers {
    static void StringTONumber(String str)
    {
//        char c = str.charAt(0);
//        int x = c;
//        System.out.println(x);

        int len = str.length();
        for(int i=0; i<len; i++)
        {
            int z = str.charAt(i);
            System.out.println(z);
        }

    }

    static void PrintNumbertoCharacters(char c5, char c6)
    {

    }

    public static void main(String[] args) {
        String s = "Hello";
        StringTONumber(s);

        PrintNumbertoCharacters('a','h');

    }
}
