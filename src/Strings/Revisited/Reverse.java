package Strings.Revisited;

// This class will contain various Methods to Reverse a String, which can be called by various other main methods or inheriting classes for Use !
public class Reverse {

    public static String normalReverse(String toReverse) {

        if (toReverse == null || toReverse.isEmpty() || toReverse.isBlank()) {
            throw new IllegalArgumentException("Not correct format for a String");
        }

        int len = toReverse.length() - 1;
        StringBuilder sb = new StringBuilder();

        for(int i = len; i >= 0; i--) {
            sb.append(toReverse.charAt(i));
        }

        return sb.toString();
    }

    public static String stringBuilderReverse(String toReverse) {

        if (toReverse == null || toReverse.isEmpty() || toReverse.isBlank()) {
            throw new IllegalArgumentException("Not correct format for a String");
        }

        return new StringBuilder(toReverse).reverse().toString();
    }
}

class MainTest {
    public static void main(String[] args) {
        System.out.println(Reverse.normalReverse("Hello Move"));

        // Note: A string of spaces like "   " is NOT empty (it has a length of 3).
        // It will pass the isEmpty() check and successfully return 3 reversed spaces.
        System.out.println(Reverse.stringBuilderReverse("  "));
    }
}