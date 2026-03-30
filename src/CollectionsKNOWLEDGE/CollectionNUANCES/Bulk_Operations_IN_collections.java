package CollectionsKNOWLEDGE.CollectionNUANCES;

import java.util.*;

public class Bulk_Operations_IN_collections {
    static void main() {

        List<Integer> list1 = new ArrayList<>();
        list1.add(100); list1.add(1000); list1.add(10000); list1.add(100); list1.add(1000000); list1.add(10000000);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(100); list2.add(1000); list2.add(10000); list2.add(1000); list2.add(1000000); list2.add(10000000);

        // Collection_to_compare_with.containsAll(Collection_that_is_compared_and returns true only if all it's elements are present in the Collection_to_compare_with)
        boolean check_IF_Contains = new HashSet<>(list1).containsAll(list2); // Hence for big collection best to use HashSet that handles duplicates and has a O(1) time complexity for lookup of elements
        System.out.println("All elements of list2 are present in list1 ? "+check_IF_Contains);

        //Approach,          Logic,                                                                            Time Complexity
        //(HashSet),         "Converts list1 to a Hash table, then checks each item in list2.",                 O(n+m)
        //(List),            "Iterates through list2 and, for every item, scans list1 from start to finish.",   O(n×m)


        ArrayList<Integer> add1 = new ArrayList<>(3);
        add1.add(10); add1.add(20); add1.add(30);
        ArrayList<Integer> add2 = new ArrayList<>(2);
        add2.add(40); add2.add(50);

        boolean Add_operation = add1.addAll(add2);
        System.out.println("Is Add operation successful ? "+Add_operation+" "+add1+add2);

        boolean Remove_elements = add1.removeAll(add2);
        System.out.println("Is Remove operation successful ? "+Remove_elements+" "+add1+add2);

        boolean Retain_elements = add1.retainAll(add2); // Remove all elements from add1 Except for add2 elements
        System.out.println("Is Retain operation successful ? "+ Retain_elements +" "+add1+add2);

        ArrayList<String> Alist = new ArrayList<>();
        Alist.add("hello"); Alist.add("what?"); Alist.add("Do not");
        System.out.println("Before conditioned removal "+Alist);

        Alist.removeIf((n) -> (Objects.equals(n, "hello")));
        System.out.println("After conditioned removal "+Alist);


    }
}