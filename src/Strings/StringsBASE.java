package Strings;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class StringsBASE {
    static void Panagram(StringBuffer sbu)
    {
        // A pangram is a sentence containing every letter in the English alphabet.


    }

    static void ExtraChar(String str, String str2)
    {
        // Two strings are given of lengths n and n+1. The second string contains all the characters of the first string, but there is one extra character.
        // The task is to find the extra character in the second string.
        //The characters in strings can be in any order.

        // we will convert the string to it's equivalent integer value
        // Find the difference and convert it to a character that should give us the required extra character

            int len1 = str.length(); // n length
            int len2 = str2.length(); // n+1 length

            int sum1 = 0;
            int sum2 = 0;

            for(int i=0; i<len2; i++) {
                if (i <= len2 - 2) {
                    char chk = str.charAt(i);
                    char chk2 = str2.charAt(i);

                    int z = chk;
                    int z2 = chk2;

                    sum1 += z;
                    sum2 += z2;
                }
                else {
                    char chknw = str2.charAt(i);
                    int z3 = chknw;
                    sum2 += z3;
                }
            }

            int diff = sum2 - sum1;
            char required = (char) diff;
            System.out.println(required);

    }

    static void Anagram(@NotNull String str3, @NotNull String str4)
    {
        //Two strings are said to be an anagram of each other if they are just permutations of each other.
        // That is, the set of characters in both the strings must be the same, only the order of characters can be different
        int len1 = str3.length();
        int len2 = str4.length();

        if(len1 == len2)
        {
          char[] c = str3.toCharArray();
          char[] c2 = str4.toCharArray();

          Arrays.sort(c);
          Arrays.sort(c2);

          if(Arrays.equals(c,c2))
              System.out.println(true);

          else
              System.out.println(false);

        }

        else
            System.out.println(false);
        
    }

    static void PatternSearch(StringBuilder sbuild)
    {
        // a text and a word will be given. The task is to find in what all positions the word is present in the text.
        String word_to_FIND = new String("world");
        StringBuilder x2 = new StringBuilder();
        // Extract each word from the sentence
        int len = sbuild.length();
        //System.out.println(len);
        //int c = 32; ASCII value for space
        for(int i=0; i<len; i++)
        {
            int x = sbuild.charAt(i);

            if(x != 32) {
                x2 = x2.append(sbuild.charAt(i)); }

            if(x == 32 || i == (len-1))
            {
                String checker = new String(x2);
                System.out.println(checker);

                if(checker.equalsIgnoreCase(word_to_FIND))
                {
                   System.out.println(true);
                   break;
                }
                x2.delete(0,x2.length());
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Out with the devil");
        StringBuffer sbuf = new StringBuffer("The quick brown fox jumps over the lazy dog");
        Panagram(sbuf);

        String s1 = "efg";
        String s2 = "gtfe";
        ExtraChar(s1,s2); // Done

        String s3 = "bc";
        String s4 = "ad";
        Anagram(s3,s4); // Done

        StringBuilder sbui = new StringBuilder("Welcome to the world of Computers");
        //PatternSearch(sbui); // Done
    }
}
