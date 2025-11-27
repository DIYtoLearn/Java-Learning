package Strings;

public class WordSeparator {
    public static void main(String[] args) {

        String str = " bye ! gg ";

        String trimmed = str.trim();

        if (trimmed.isEmpty())
            System.out.println("EMPTY STRING");


        String[] words = trimmed.split("\\s+");

        System.out.println(words[0]+" "+words[1]);//+" "+words[2]+" "+words[3]+" "+words[4]);
        System.out.println(words.length);

    // ADD EXCEPTION HANDLING FOR empty string to stop the code execution error be handled by OS
        // OS error Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        //	at Strings.WordSeparator.main(WordSeparator.java:15)

        // ANOTHER PROBLEM WITH this solution is it counts special characters as a word as well
    }
}