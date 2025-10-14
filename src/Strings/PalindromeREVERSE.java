package Strings;

public class PalindromeREVERSE {

    static void Palindrome(String s1)
    {

    }

    static void reverse(String s2)
    {
        int len = s2.length();
        String s3 = "";
        System.out.println(s3);

        for(int i=0; i<len; i++)
        {
            s3 = s3 + s2.charAt(i);
        }

        System.out.println(s3);
    }

    public static void main(String[] args) {
        String chk = "Hello";
        Palindrome(chk);
        reverse(chk);

    }
}
