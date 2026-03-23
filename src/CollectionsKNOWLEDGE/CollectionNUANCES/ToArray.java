package CollectionsKNOWLEDGE.CollectionNUANCES;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ToArray {
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(10); ls.add(100); ls.add(1000); ls.add(10000); ls.add(100000);

        System.out.println("Object[] toArray()");
        Object[] arr2 = ls.toArray();
        for(Object element : arr2)
        {
            System.out.print(element+" ");
        }

        System.out.println("\nT[] toArray(T[])");
        Integer[] arr = new Integer[ls.size()];
        arr = ls.toArray(arr);
        for(Integer element : arr)
        {
            System.out.print(element+" ");
        }

        System.out.println("\n");
        System.out.println("Array to LIST");
        Integer[] arr3 = {10,30,53,34};
        List<Integer> list2 = Arrays.asList(arr3);
        System.out.println(list2);

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list = Arrays.asList(array);
        System.out.println(list); // Output: [Apple, Banana, Cherry]
    }
}