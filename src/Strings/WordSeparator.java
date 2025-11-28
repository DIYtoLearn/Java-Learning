package Strings;

import java.util.Scanner;

public class WordSeparator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String trimmed = str.trim();

        if (trimmed.isEmpty())
            System.out.println("EMPTY STRING");


        String[] words = trimmed.split("\\s+");

        //System.out.println(words[0]+" "+words[1]);//+" "+words[2]+" "+words[3]+" "+words[4]);
        System.out.println(words.length);
        
        // A PROBLEM WITH this solution is it counts special characters as a word as well
    }
}