package SmallTOPICS.Streams;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MaxElement {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(144);
        list.add(13); list.add(112); list.add(1); list.add(1);

        int max = list.stream()
                .max(Integer::compareTo).get();
        System.out.println(max);

        int[] arr = {2,3,211,3};
        int max2 = Arrays.stream(arr).max().getAsInt();
        System.out.println(max2);
    }
}