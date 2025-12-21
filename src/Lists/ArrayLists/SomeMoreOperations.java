package Lists.ArrayLists;
import java.util.Collections;
import java.util.ArrayList;

    public class SomeMoreOperations
    {
        public static void main(String[] args)
        {

            ArrayList<Integer> al = new ArrayList<>();

            al.sort(null); // Sorts the Arraylist in ascending order
            System.out.println(al);

            al.sort((a,b) ->b - a); // Sorts the Arraylist in descending order
            System.out.println(al);

            Collections.sort(al, Collections.reverseOrder()); //
            System.out.println(al.reversed());
        }
    }