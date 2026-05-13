package CollectionsKNOWLEDGE.CollectionClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
    static void main() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);

        int max = Collections.max(list1); // Is this step internally unboxing from Integer to int ?
        System.out.println(max);
        // The reason your code runs smoothly without errors is due to two powerful features introduced in Java 5: Autoboxing and Unboxing.
        // These allow the Java compiler to automatically bridge the gap between primitive types (like int) and their corresponding Wrapper classes (like Integer).

        List<Character> list = new ArrayList<>();

        list.add('a');
        list.add('1');
        list.add('z');
        list.add('y');

        System.out.println(Collections.min(list));
    }
}