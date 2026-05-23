package AllAboutArrays.Arrays;
import java.util.Arrays;

public class ArrayInsert_Retrieval {
    static void main() {

        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

        for(int i=1; i<=arr.length; i++)
        {
            arr[i-1] = i;
        }
        System.out.println(Arrays.toString(arr));

        // Retrieval of Array elements is done based on Index
        // We cannot remove an element from an array because they have fixed size only modify it
        // Hence no resize operation takes place when an element is retrieved
    }
}