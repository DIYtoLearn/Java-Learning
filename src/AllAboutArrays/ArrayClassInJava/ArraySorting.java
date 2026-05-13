package AllAboutArrays.ArrayClassInJava;
import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    static void main() {

        Integer[] arr = {92,334,15,23,11,353,0,3455,2,2252};

        // Ascending sort using built in method
        Arrays.sort(arr); // sort uses the comparable class implemented by array class internally for natural order of sorting
        System.out.println("Ascending "+Arrays.toString(arr));

        // Descending sort using comparator
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("Descending "+Arrays.toString(arr));

    }
}