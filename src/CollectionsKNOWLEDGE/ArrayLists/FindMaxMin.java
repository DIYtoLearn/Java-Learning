package CollectionsKNOWLEDGE.ArrayLists;
import java.util.ArrayList;
import java.util.ListIterator;

class AllSolution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        ListIterator<Integer> it = arr.listIterator();
        int max = Integer.MIN_VALUE;

        while(it.hasNext())
        {
            int compare_element = it.next();
                if(compare_element > max)
                    max = compare_element;

        }

        return max;

    }

    public static int minimumElement(ArrayList<Integer> arr) {
        // Your code here
        ListIterator<Integer> it = arr.listIterator();
        int min = Integer.MAX_VALUE;

        while(it.hasNext())
        {
            int compare_element = it.next();
                if(compare_element < min)
                    min = compare_element;

        }

        return min;
    }
}

public class FindMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(1);
        arr.add(2);

       int max = AllSolution.maximumElement(arr);
       int min = AllSolution.minimumElement(arr);

       System.out.println("MAX in the list "+max);
        System.out.println("MIN in the list "+min);

    }
}