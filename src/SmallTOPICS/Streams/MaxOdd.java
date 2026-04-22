package SmallTOPICS.Streams;

import java.util.Arrays;

public class MaxOdd {
    static void main() {
        int[] arr = {1,2,3,4};

        int maxOdd = Arrays.stream(arr)
                .filter(x-> x%2 != 0)
                .max()
                .getAsInt();

        System.out.println(maxOdd);
    }
}
