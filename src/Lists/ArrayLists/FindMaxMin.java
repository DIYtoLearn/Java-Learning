package Lists.ArrayLists;
import java.util.ArrayList;
import java.util.ListIterator;

class AllSolution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        ListIterator<Integer> it = arr.listIterator();

        while(it.hasNext())
        {
            

        }


    }

    public static int minimumElement(ArrayList<Integer> arr) {
        // Your code here
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


    }
}
