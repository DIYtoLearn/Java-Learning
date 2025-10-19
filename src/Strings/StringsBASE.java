package Strings;

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

            int len1 = str.length();
            int len2 = str2.length();

            int max = Math.max(len2,len1);
            int min = Math.min(len2, len1);

            int sum1 = 0;
            int sum2 = 0;

            for(int i=0; i<max; i++) {
                if (i < min - 1) {
                    char chk = str.charAt(i);
                    int z = chk;
                    sum1 += z;
                    sum2 += z;
                }
                else {
                    char chk2 = str2.charAt(i);
                    int z2 = chk2;
                    sum2 += z2;
                }
            }

            int diff = sum2 - sum1;
            char required = (char) diff;
            System.out.println(required);

    }

    static void Anagram(String str3, String str4)
    {
        //Two strings are said to be an anagram of each other if they are just permutations of each other.
        // That is, the set of characters in both the strings must be the same, only the order of characters can be different
        int len1 = str3.length();
        int len2 = str4.length();

        if(len2 != len1)
            System.out.println(false);
        else
            System.out.println(true);
        
    }

    static void PatternSearch(StringBuilder sbuild)
    {
        // a text and a word will be given. The task is to find in what all positions the word is present in the text.
        String word_to_FIND = "world";

        // Extract each word from the sentence
    }



    public static void main(String[] args) {

        System.out.println("Out with the devil");
        StringBuffer sbuf = new StringBuffer("The quick brown fox jumps over the lazy dog");
        Panagram(sbuf);

        String s1 = "abcd";
        String s2 = "cbdae";
        ExtraChar(s1,s2);

        String s3 = "silent";
        String s4 = "list";
        Anagram(s3,s4);

        StringBuilder sbui = new StringBuilder("Welcome to the world of Computers");
        PatternSearch(sbui);
    }
}
