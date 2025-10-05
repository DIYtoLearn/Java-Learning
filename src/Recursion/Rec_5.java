package Recursion;
//Check if a string is palindrome using recursion.

import java.util.Scanner;
public class Rec_5 {

    static String PalinRec(String s1)
    {

        if(s1.isEmpty() || s1.length()==1)
        {
            return s1;
        }

        return PalinRec(s1.substring(1)) + s1.charAt(0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String val = PalinRec(s);

        if(s.compareToIgnoreCase(val) == 0)
            System.out.println("Is a palindrome");

        else
            System.out.println("Not a palindrome");
    }
}