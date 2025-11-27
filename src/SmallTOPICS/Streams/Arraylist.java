package SmallTOPICS.Streams;

import java.util.Arrays;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(10, 7, 6, 58, 621);
        li.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x > 10)
                .forEach(System.out::println);
    }
}