package Strings;

public class PalindromeREVERSE {

    static void Palindrome(String s1)
    {
        char[] arr = s1.toCharArray();
        // System.out.println(arr); // Prints the character array
        // Character array two pointer method that has O(n) time complexity for reversing a string
        int i = 0; int j = arr.length - 1;

        while(i < j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

                i++;
                j--;

        }
        String test =  new String(arr);
        System.out.println(test);

        // Comparision between two strings
        System.out.println( s1.compareTo(test));
        System.out.println( s1.compareToIgnoreCase(test)); // Can be used for palindrome check
        System.out.println( s1.contains(test));
        System.out.println( s1.equals(test));
        System.out.println( s1.equalsIgnoreCase(test)); // Can be used for palindrome check
    }

    static void reverse(String s2)
    {
        int len = s2.length()-1;

        // All of these string declarations works !!
        // String s3 = new String();
        // String s3 = "";

        // StringBuilder s3 = new StringBuilder();
         StringBuffer s3 = new StringBuffer();

        System.out.println(len);

        for(int i=len; i>=0; i--)
        {

            //s3 = s3 + s2.charAt(i);
            s3 = s3.append(s2.charAt(i));
        }
        System.out.println(s3);
    }

    static void reverseWords(String s)
    {
        // Trim extra whitespaces
        // Create a string with words starting from the end of the original string

        int len = s.length();
        StringBuffer sbu = new StringBuffer();

        //Word Extractor from the end of the original string
       int chr;
        for(int i=len-1; i>=0; i--)
        {
            chr = s.charAt(i);

            if(chr != 32)
            {
                sbu = sbu.append(s.charAt(i));

            }

        }
        System.out.println(sbu);
    }

    public static void main(String[] args) {
        String chk = "Madam";
        //Palindrome(chk);
        //reverse(chk);
        reverseWords("  hello world  ");
    }
} 