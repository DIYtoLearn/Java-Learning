package Strings;

/*
HELLO , YELLOW, GALLON, MELLOW
Longest prefix in all the words: "LLO"

Our task is to find that longest prefix in a given string arrays
 */

import java.util.Scanner;

class PrefixCalc{
    String[] str;

    PrefixCalc(String[] st)
    {
        str = st;
    }

    protected String longestCommonPrefix()
    {

        return "noddy";

    }

}


public class LongestPREFIX {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int size = 4;
//        String[] str = new String[size];
//
//        System.out.println("Enter your string");
//        for(int i=0; i<size; i++)
//        {
//            str[i] = sc.nextLine();
//        }

//        for(String x : str)
//        {
//            System.out.print(x+" ");
//        }

        String[] str2 = {"HELLO","YELLOW", "GALLON", "MELLOW"};

        PrefixCalc pc = new PrefixCalc(str2);
        String req = pc.longestCommonPrefix();

        System.out.println(req);

    }
}