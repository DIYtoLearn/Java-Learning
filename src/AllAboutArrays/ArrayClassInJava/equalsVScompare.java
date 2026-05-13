package AllAboutArrays.ArrayClassInJava;

import java.util.Arrays;
import java.util.Comparator;

public class equalsVScompare {
    static void main() {

        String[] arr = {"GFG", "upayan"};
        String[] arr2 = {"upayan", "GFG"};

        /*
         * This method checks for equality. For two arrays to be equal, they must:
         * Contain the same number of elements.
         * Have all corresponding pairs of elements in the same order to be equal.
         * Even though both arrays contain the same strings, their positions are swapped. Therefore, the result is false.
         */
        System.out.println(Arrays.equals(arr,arr2));

        /*
        Introduced in Java 9, this method performs a lexicographical comparison.
        It looks for the first index where the two arrays differ.
        If it finds a difference, it returns the result of the comparison between those two elements (in this case, the difference in ASCII/Unicode values of the first characters).
        If arr is "less than" arr2, it returns a negative value.
        If arr is "greater than" arr2, it returns a positive value.
        If they are identical, it returns 0.
        Character 'G' (ASCII 71) is compared to 'u' (ASCII 117). Calculation: 71 - 117 = -46.
         */
        System.out.println(Arrays.compare(arr,arr2));
    }
}