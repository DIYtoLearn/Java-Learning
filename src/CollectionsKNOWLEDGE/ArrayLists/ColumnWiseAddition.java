package CollectionsKNOWLEDGE.ArrayLists;
import java.util.ArrayList;

class AddTheList
{
    // This method constructs and returns a 2D ArrayList (jagged array)
    // Each inner list represents a row
    protected static ArrayList<ArrayList<Integer>> returnsTheList()
    {
        ArrayList<ArrayList<Integer>> alist = new ArrayList<>();

        // Row 0 → [2,3,5]
        alist.add(new ArrayList<>());
        alist.getFirst().add(2);
        alist.getFirst().add(3);
        alist.getFirst().add(5);

        // Row 1 → [1,2]
        alist.add(new ArrayList<>());
        alist.get(1).add(1);
        alist.get(1).add(2);

        // Row 2 → [1,4,5,1]
        alist.add(new ArrayList<>());
        alist.get(2).add(1);
        alist.get(2).add(4);
        alist.get(2).add(5);
        alist.get(2).add(1);

        // Row 3 → [34]
        alist.add(new ArrayList<>());
        alist.get(3).add(34);

        // Adding empty rows (edge case testing)
        alist.add(new ArrayList<>());
        alist.add(new ArrayList<>());
        alist.add(new ArrayList<>());
        alist.add(new ArrayList<>());

        // Printing the 2D structure
        for(ArrayList<Integer> element : alist)
        {
            for(Integer element2 : element){
                System.out.print(element2+" ");
            }
            System.out.println();
        }

        return alist;
    }
}

public class ColumnWiseAddition
{
    static void main()
    {
        // Fetching the jagged 2D list
        ArrayList<ArrayList<Integer>> alistRequired =  AddTheList.returnsTheList();

        // Accessing element at row 1, column 1
        int val = alistRequired.get(1).get(1);

        // Trying to access invalid column (index 2 in row 1)
        // If not present → catch and insert 0
        try{
            int val2 = alistRequired.get(1).get(2);
        }
        catch (IndexOutOfBoundsException e)
        {
            alistRequired.get(1).add(0);
            System.out.println("Kaboom");
            System.out.println(alistRequired);
        }

        // maxCol → number of rows (IMPORTANT: misleading name)
        int MaxRowsPresent = alistRequired.size();
        System.out.println("Max Columns Size "+MaxRowsPresent);

        // maxRowSize → maximum number of elements in any row
        int maxRowSize = 0;
        for(ArrayList<Integer> alist : alistRequired){
            if(alist.size() > maxRowSize)
                maxRowSize = alist.size();
        }
        System.out.println("Max Row Size "+maxRowSize);

        // Perform column-wise addition
        ColumnAdd(alistRequired,MaxRowsPresent,maxRowSize);
    }

    protected static void ColumnAdd(ArrayList<ArrayList<Integer>> alistActual, int MaxRowsPresent, int maxRowSize)
    {
        // Stores sum of each vertical column
        ArrayList<Integer> StoreVerticalSum = new ArrayList<>();

        int sum = 0; // accumulator for each column

        // i → column index
        for(int i=0; i<MaxRowsPresent; i++)
        {
            // j → row index
            for(int j=0; j<maxRowSize; j++)
            {
                try{
                    // Access element at [row j][column i]
                    int val = alistActual.get(j).get(i);
                    sum += val;
                }
                catch (IndexOutOfBoundsException e)
                {
                    // If column doesn't exist in that row → treat as 0
                    sum += 0;
                }
            }

            // Only store positive sums
            if(sum > 0){
                StoreVerticalSum.add(sum);
                sum = 0;
            }
        }

        System.out.println(StoreVerticalSum);

        // Find minimum vertical sum using streams
        int min = StoreVerticalSum.stream()
                .min(Integer::compareTo).get();

        System.out.println("Min Vertical Sum = "+min);
    }
}