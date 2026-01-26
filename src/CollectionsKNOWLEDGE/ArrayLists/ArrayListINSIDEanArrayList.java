package CollectionsKNOWLEDGE.ArrayLists;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class alltheways
{
    protected void Manual()
    {
        // This is the manual way to add elements to the arrayList
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> row = new ArrayList<>();
        row.add(10);
        row.add(20);
        row.add(30);

        arr.add(row);

        // 4. Create and add another row directly
        arr.add(new ArrayList<>()); // Add an empty Row 1
        arr.get(1).add(99);         // Add number 99 to Row 1
        arr.get(1).add(12);

        arr.add(new ArrayList<>());
        arr.get(2).add(100);

        System.out.println(arr);

    }

    protected void FixedInnerLists()
    {
        // Fixed inner size arraylist, cannot add/remove items from the rows but can change the values
        // Create rows using Arrays.asList
        ArrayList<ArrayList<Integer>> arr3 = new ArrayList<>();

        arr3.add(new ArrayList<>(Arrays.asList(1, 2, 3))); // Row 0
        arr3.add(new ArrayList<>(Arrays.asList(4, 5)));    // Row 1
    }

    protected void ListsofIMMUTABLE()
    {

        // Using List.of()
        // The resulting lists are immutable. These are great for creating constant lookup tables
        List<List<Integer>> arr4 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8)
        );
        System.out.println(arr4);
        //arr4.add(10); //will throw an error here!
    }

    protected void CompiMethod()
    {
        // Double Brace Initialization
        // Generally seen in older code or competitive programming. It uses an anonymous inner class.
        // discouraged in production code because it creates extra class files and can cause memory leaks
        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>() {{
            add(new ArrayList<>() {{ add(1); add(2); }});
            add(new ArrayList<>() {{ add(3); }});
        }};
        System.out.println(arr2);

    }
}


class AlltheACCESSways
{
    alltheways atw = new alltheways();

    protected void ACCESS1()
    {



    }
}


public class ArrayListINSIDEanArrayList {
    public static void main(String[] args) {

        alltheways atw = new alltheways();
        atw.Manual();



    }
}
