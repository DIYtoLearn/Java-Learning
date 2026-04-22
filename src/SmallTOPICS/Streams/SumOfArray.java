package SmallTOPICS.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfArray {
    static void main() {
        int[] arr = {2,3,2,3};
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list);

       int result = Arrays.stream(arr).sum();
       System.out.println(result);

        int res = IntStream
                .rangeClosed(list.getFirst(),list.size())
                .sum();
        System.out.println(res);
    }
}