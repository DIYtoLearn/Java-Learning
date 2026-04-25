package Strings.Revisited;

import java.util.Locale;

class RevisitingAllProblems{

    public static void LengthOfString(String s)
    {
        int NumberOfCharacters = 0;
        char[] arr = s.toCharArray();
        int len = arr.length;
        System.out.println(len);
        System.out.println(s.length());

        try {
            while(true)
            {
                char ch = s.charAt(NumberOfCharacters);
                NumberOfCharacters++;
            }
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println("chodna");
            NormalFlow(NumberOfCharacters);
            CountingCharacters(s,NumberOfCharacters);
        }
    }
    // Panagram or one extra character
    private static void NormalFlow(int n)
    {
        System.out.println("Length of a string without using any method = "+n);
    }

    protected static void CountingCharacters(String s, int NumberOfCharacters)
    {
        int[] countArray = new int[26];
        s = s.toLowerCase();
        System.out.println(s);
        int subtract = 'a';
        int to_be_subtracted_from;
        for(int i=0; i<NumberOfCharacters; i++){
            if(!Character.isWhitespace(s.charAt(i))){
            to_be_subtracted_from = s.charAt(i);
            countArray[to_be_subtracted_from-subtract]++; }
        }

        for(int x : countArray) {
            System.out.print(x+" ");
        }
    }

    protected static void ExtraCharacter(String s1, String s2){

        int result = 0;
        for(char c : s1.toCharArray()){
            result ^= c;
        }

        for(char c : s2.toCharArray()){
            result ^= c;
        }

        System.out.println("\n"+(char) result);

    }
}

public class HelloString {
    static void main() {
        RevisitingAllProblems.LengthOfString("The quick brown fox jumps over the lazy dog"); // You cannot safely check bounds without length — only workaround is exception handling
        RevisitingAllProblems.ExtraCharacter("aabbc", "aaxbbc");
    } // DeatHerTZ
}
